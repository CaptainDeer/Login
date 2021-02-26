package com.captaindeer.login.activities

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.captaindeer.login.R


class LoginActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val tvRegistry: TextView = findViewById<TextView>(R.id.tvRegistry)

        tvRegistry.setOnClickListener {
            val intent = Intent(this, RegistryActivity::class.java)
            startActivity(intent)
        }

    }


}