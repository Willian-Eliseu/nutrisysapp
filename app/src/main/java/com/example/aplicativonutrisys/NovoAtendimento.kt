package com.example.aplicativonutrisys

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_novo_atendimento.*

class NovoAtendimento : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_novo_atendimento)

        btn_atd_solicitar.setOnClickListener {
            Toast.makeText(applicationContext, "Atendimento solicitado com sucesso!", Toast.LENGTH_SHORT).show()
            finish()
        }

        atd_btn_voltar.setOnClickListener {
            finish()
        }
    }
}