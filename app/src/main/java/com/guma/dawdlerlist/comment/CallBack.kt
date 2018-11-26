package com.guma.dawdlerlist.comment

/**
 * @Description:
 * @Author:王旭
 * @CreatTime:2018/11/24 0024
 * @LastModify(最终修改人):王旭
 * @LastModifyTime(最终修改时间):2018/11/24 0024
 * @LastChekedBy: 王旭
 * @needingAttention(注意事项):
 */
interface CallBack<T> {
    fun OnDateGet(t: T)
}
