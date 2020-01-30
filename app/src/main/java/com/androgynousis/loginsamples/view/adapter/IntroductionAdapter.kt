package com.androgynousis.loginsamples.view.adapter

import `in`.pongo.basic.model.ScreenItem
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.viewpager.widget.PagerAdapter
import com.androgynousis.loginsamples.R

class IntroductionAdapter(private val context: Context, private val list: List<ScreenItem>) : PagerAdapter() {

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) = container.removeView(`object` as View)
    override fun isViewFromObject(view: View, `object`: Any): Boolean = view == `object`
    override fun getCount(): Int = list.size

    override fun instantiateItem(container: ViewGroup, position: Int): Any {

        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val layoutScreen = inflater.inflate(R.layout.layout_screen, null)

        val imgSlide = layoutScreen.findViewById(R.id.intro_img) as ImageView
        val title = layoutScreen.findViewById(R.id.intro_title) as TextView
        val description = layoutScreen.findViewById(R.id.intro_description) as TextView

        title.text = list[position].title
        description.text = list[position].description
        imgSlide.setImageResource(list[position].screenImg)

        container.addView(layoutScreen)
        return layoutScreen

    }


}