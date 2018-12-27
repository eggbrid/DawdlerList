package com.guma.dawdlerlist.comment

import com.google.gson.Gson
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import java.lang.reflect.ParameterizedType

/**
 * @Description:personter
 * @Author:王旭
 * @CreatTime:2018/11/24 0024
 * @LastModify(最终修改人):王旭
 * @LastModifyTime(最终修改时间):2018/11/24 0024
 * @LastChekedBy: 王旭
 * @needingAttention(注意事项):
 */
abstract class BasePresenter<T> {

    private val BASEURL = ""
    private var retrofit = Retrofit.Builder().baseUrl(BASEURL).build()!!
    protected var t: T
    var gson: Gson = Gson()!!

    init {
        val tClass = (javaClass.genericSuperclass as ParameterizedType).actualTypeArguments[0] as Class<T>
        t = retrofit.create(tClass)
    }


    fun <B> toResponse(call: Call<Response<String>>, callBank: CallBack<B>): Call<Response<String>> {
        call.enqueue(object : Callback<Response<String>> {
            override fun onResponse(call: Call<Response<String>>, response: Response<Response<String>>) {
               var classes: Class<B> = (javaClass.genericSuperclass as ParameterizedType).actualTypeArguments[0] as Class<B>
                //暂时简单处理
                if (classes!=null){
                    var b: B = gson.fromJson(
                        response.body().toString(),classes )
                    callBank.OnDateGet(b)
                }

            }

            override fun onFailure(call: Call<Response<String>>, t: Throwable) {

            }
        })
        return call
    }
}

