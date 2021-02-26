package com.captaindeer.login.activities

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.captaindeer.login.R
import tech.developingdeveloper.toaster.Toaster

class RegistryActivity : AppCompatActivity() {

    lateinit var etName: EditText
    lateinit var etLastName: EditText
    lateinit var etEmail: EditText
    lateinit var etPassword: EditText
    lateinit var tvInfo: TextView
    lateinit var btnRegistry: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registry)

        etName = findViewById(R.id.registry_etName)
        etLastName = findViewById(R.id.registry_etLastName)
        etEmail = findViewById(R.id.registry_etEmail)
        etPassword = findViewById(R.id.registry_etPassword)
        tvInfo = findViewById(R.id.registry_tvInfo)
        btnRegistry = findViewById(R.id.registry_btnRegistry)

        btnRegistry.setOnClickListener {

            if (etName.text.isEmpty() || etLastName.text.isEmpty() || etEmail.text.isEmpty() || etPassword.text.isEmpty()) {
                Toaster.popError(
                    this,
                    "Please fill all the fields",
                    Toaster.LENGTH_SHORT
                ).show()
            } else {
                val name = etName.text.toString()
                val lastName = etLastName.text.toString()
                val eMail = etEmail.text.toString()
                val password = etPassword.text.toString()

                etName.text.clear()
                etLastName.text.clear()
                etEmail.text.clear()
                etPassword.text.clear()

                tvInfo.text = "Welcome " + name + " " + lastName + "\n" +
                        "This is your eMail: " + eMail + "\n" + "And your password: " + password

            }

        }

    }


}