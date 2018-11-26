package com.guma.dawdlerlist.comment

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import java.lang.reflect.ParameterizedType

/**
 * @Description:
 * @Author:王旭
 * @CreatTime:2018/11/24 0024
 * @LastModify(最终修改人):王旭
 * @LastModifyTime(最终修改时间):2018/11/24 0024
 * @LastChekedBy: 王旭
 * @needingAttention(注意事项):
 */
abstract class BasePersonter<T> {

    private val BASEURL = ""
     var retrofit = Retrofit.Builder().baseUrl(BASEURL).build()!!
    protected var t: T

    init {
        val tClass = (javaClass.genericSuperclass as ParameterizedType).actualTypeArguments[0] as Class<T>
        t = retrofit.create(tClass)
    }


    fun <T> toResponse(call: Call<Response<String>>, callBank: CallBack<T>): Call<Response<String>> {
        call.enqueue(object : Callback<Response<String>> {
            override fun onResponse(call: Call<Response<String>>, response: Response<Response<String>>) {

            }

            override fun onFailure(call: Call<Response<String>>, t: Throwable) {

            }
        })
        return call
    }
}
