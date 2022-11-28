package com.example.aplicativonutrisys

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_meus_dados.*

class MeusDados : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meus_dados)

        perf_btn_voltar.setOnClickListener {
            finish()
        }
    }
}