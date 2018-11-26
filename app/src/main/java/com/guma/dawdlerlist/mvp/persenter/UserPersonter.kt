package com.guma.dawdlerlist.mvp.persenter

import com.guma.dawdlerlist.comment.CallBack
import com.guma.dawdlerlist.mvp.model.User
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

/**
 * @Description:
 * @Author:王旭
 * @CreatTime:2018/11/24 0024
 * @LastModify(最终修改人):王旭
 * @LastModifyTime(最终修改时间):2018/11/24 0024
 * @LastChekedBy: 王旭
 * @needingAttention(注意事项):
 */
interface UserPersonter {
    @FormUrlEncoded
    @POST("user/personal_list_info")
    fun getPersonalListInfo(@Field("cur_page") page: Int, call: CallBack<User>): Call<Response<String>>
}
