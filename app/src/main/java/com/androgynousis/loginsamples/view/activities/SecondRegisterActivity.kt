package com.androgynousis.loginsamples.view.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.androgynousis.loginsamples.R
import kotlinx.android.synthetic.main.activity_second_register.*

class SecondRegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_register)

        register.setOnClickListener { startActivity(Intent(this, SecondLoginActivity::class.java)) }
    }
}
