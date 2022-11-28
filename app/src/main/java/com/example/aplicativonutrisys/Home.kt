package com.example.aplicativonutrisys

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_home.*
//import okhttp3.*
//import java.io.IOException

class Home : AppCompatActivity() {
    private val nomeUsuario = "Willian"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        home_text_nome.text = "Olá, $nomeUsuario!"

        home_btn_receitas.setOnClickListener {
            val intent = Intent(this, Receitas::class.java)
            startActivity(intent)
        }

        home_btn_agenda.setOnClickListener {
            val intent = Intent(this, Atendimentos::class.java)
            startActivity(intent)
        }

        home_btn_profissionais.setOnClickListener {
            val intent = Intent(this, Profissionais::class.java)
            startActivity(intent)
        }

        //barra de navegação
        nav_btn_home.setOnClickListener {
            finish()
        }

        nav_btn_agenda.setOnClickListener {
            val intent = Intent(this, Atendimentos::class.java)
            startActivity(intent)
        }

        nav_btn_novo.setOnClickListener {
            val intent = Intent(this, NovoAtendimento::class.java)
            startActivity(intent)
        }

        nav_btn_receitas.setOnClickListener {
            val intent = Intent(this, Receitas::class.java)
            startActivity(intent)
        }

        nav_btn_perfil.setOnClickListener {
            val intent = Intent(this, MeusDados::class.java)
            startActivity(intent)
        }


    }
}