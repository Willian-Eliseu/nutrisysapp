package com.example.aplicativonutrisys

import android.content.SharedPreferences
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_cadastro.*

class Cadastro : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)

        cad_btn_cadastro.setOnClickListener {
            var campoNome: String = inp_name.toString()
            var campoEmail: String = inp_email.toString()
            var campoSenha: String = inp_password.toString()
            var campoTelefone: String = inp_phone.toString()

            val dadosUsuario = Usuario()
            dadosUsuario.setNomeDoUsuario(campoNome)
            dadosUsuario.setEmailDoUsuario(campoEmail)
            dadosUsuario.setSenhaDoUsuario(campoSenha)
            dadosUsuario.setTelefoneDoUsuario(campoTelefone)

            if(dadosUsuario.getNomeDoUsuario() != ""){
                Toast.makeText(applicationContext,"Cadastro realizado com sucesso",Toast.LENGTH_SHORT).show()
                finish()
            }
        }
    }

    /*
    override fun onDestroy() {
        super.onDestroy()
    }
    */
}