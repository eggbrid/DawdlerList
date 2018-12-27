package com.guma.dawdlerlist.mvp.view.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.guma.dawdlerlist.R

/**
 * @Description:
 *@Author:王旭
 *@CreatTime:2018/12/27 0027
 *@LastModify(最终修改人):王旭
 *@LastModifyTime(最终修改时间):2018/12/27 0027
 *@LastChekedBy: 王旭
 *@needingAttention(注意事项):
 */
class MainHomeFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }
}