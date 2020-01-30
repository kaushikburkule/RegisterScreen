package com.androgynousis.loginsamples.view.activities

import `in`.pongo.basic.model.ScreenItem
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import com.androgynousis.loginsamples.R
import com.androgynousis.loginsamples.view.adapter.IntroductionAdapter
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.activity_intro.*

class IntroActivity : AppCompatActivity() {

    private lateinit var animation : Animation

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)
        supportActionBar?.hide()

        animation = AnimationUtils.loadAnimation(applicationContext,R.anim.anim_button)

        val list = ArrayList<ScreenItem>()
        list.add(ScreenItem("Home Automation", getString(R.string.app_name), R.drawable.ic_dev_focus))
        list.add(ScreenItem("Smart Home", getString(R.string.app_name), R.drawable.ic_code_typing))
        list.add(ScreenItem("Pongo House", getString(R.string.app_name), R.drawable.ic_code_review))

        val adapter = IntroductionAdapter(this, list)
        screen_viewpager.adapter = adapter
        tab_indicator.setupWithViewPager(screen_viewpager, true)

        tab_indicator.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
            override fun onTabReselected(tab: TabLayout.Tab?) {}
            override fun onTabUnselected(tab: TabLayout.Tab?) {}
            override fun onTabSelected(tab: TabLayout.Tab?) {
                if (tab?.position == list.size -1) lastScreen()
            }
        })

        tv_skip.setOnClickListener { screen_viewpager.currentItem = list.size }
        btn_get_started.setOnClickListener {
            startActivity(Intent(this, SplashActivity::class.java))
            finish()
        }

        btn_next.setOnClickListener {
            var position = screen_viewpager.currentItem
            if (position < list.size) {
                position++
                screen_viewpager.currentItem = position
            }
            if (position == list.size -1) lastScreen()
        }

    }

    private fun lastScreen() {
        btn_next.visibility = View.INVISIBLE
        btn_get_started.visibility = View.VISIBLE
        tv_skip.visibility = View.INVISIBLE
        tab_indicator.visibility = View.INVISIBLE
        btn_get_started.animation = animation
    }

}
