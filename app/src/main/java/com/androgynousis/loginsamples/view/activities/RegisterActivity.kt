package com.androgynousis.loginsamples.view.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.androgynousis.loginsamples.R
import kotlinx.android.synthetic.main.activity_login.*

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        registerButton.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java));
        }

    }

}
