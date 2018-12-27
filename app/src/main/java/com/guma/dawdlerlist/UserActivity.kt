package com.guma.dawdlerlist

import android.app.Activity
import android.os.Bundle
import com.guma.dawdlerlist.mvp.persenter.UserPersonter

/**
 * @Description:
 * @Author:王旭
 * @CreatTime:2018/11/24 0024
 * @LastModify(最终修改人):王旭
 * @LastModifyTime(最终修改时间):2018/11/24 0024
 * @LastChekedBy: 王旭
 * @needingAttention(注意事项):
 */
class UserActivity : Activity() {
    var userPersonter: UserPersonter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

}
}
