package com.guma.dawdlerlist

import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentTransaction
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.guma.dawdlerlist.mvp.view.fragment.MainDescriptionFragment
import com.guma.dawdlerlist.mvp.view.fragment.MainHomeFragment
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app_bar_main.*

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    private var currentFragment: Fragment? = null
    private var mainHomeFragment: MainHomeFragment? = null
    private var mainDescriptionFragment: MainDescriptionFragment? = null


    private var fragmentTransaction: FragmentTransaction? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)


        val toggle = ActionBarDrawerToggle(
            this, drawer_layout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close
        )
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()

        nav_view.setNavigationItemSelectedListener(this)


    }

    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.
        fragmentTransaction = supportFragmentManager.beginTransaction()

        when (item.itemId) {
            R.id.navHome -> {//首页
                // Handle the camera action
                if (mainHomeFragment == null) {
                    mainHomeFragment = MainHomeFragment()
                    fragmentTransaction!!.add(R.id.fg, mainHomeFragment!!).commit()
                }else{
                    fragmentTransaction!!.replace(R.id.fg,mainHomeFragment!!).commit()
                }
            }
            R.id.navDescription -> {//任务记录
                if (mainDescriptionFragment == null) {
                    mainDescriptionFragment = MainDescriptionFragment()
                    fragmentTransaction!!.add(R.id.fg, mainDescriptionFragment!!).commit()

                }else{
                    fragmentTransaction!!.replace(R.id.fg,mainDescriptionFragment!!).commit()
                }
            }
            R.id.navLoyalty -> {//成就
                if (mainDescriptionFragment == null) {
                    mainDescriptionFragment = MainDescriptionFragment()
                    fragmentTransaction!!.add(R.id.fg, mainDescriptionFragment!!).commit()
                }else{
                    fragmentTransaction!!.replace(R.id.fg,mainDescriptionFragment!!).commit()
                }
            }
            R.id.navShare -> {//分享

            }
            R.id.navAbout -> {//关于我们

            }
            R.id.navSettings -> {//设置

            }
        }

        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }
}
