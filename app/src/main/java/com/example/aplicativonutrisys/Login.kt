package com.example.aplicativonutrisys

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class Login : AppCompatActivity() {

    //val nomedousuario = arrayListOf("Willian", "Eliseu", "Jenifer")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        cad_btn_cadastro.setOnClickListener {

            /*
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
            */

            var loginEmail: String = inp_email.toString()
            var loginSenha: String = inp_password.toString()

            if((loginEmail != null && loginEmail != "") && (loginSenha != null && loginSenha != "")){
                Toast.makeText(applicationContext, "Bem vindo Fulano!", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, Home::class.java)
                startActivity(intent)
            }else{
                Toast.makeText(applicationContext, "Os dados não conferem, por favor, tente novamente!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}