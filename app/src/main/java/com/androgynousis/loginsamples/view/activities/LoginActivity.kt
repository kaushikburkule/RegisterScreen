package com.androgynousis.loginsamples.view.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.androgynousis.loginsamples.R
import com.androgynousis.loginsamples.view.utils.InternetDialog

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        if (InternetDialog(this).internetStatus) Toast.makeText(this, "INTERNET VALIDATION PASSED", Toast.LENGTH_SHORT).show()

    }
    
}
