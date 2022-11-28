package com.example.aplicativonutrisys


import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_profissionais.*
import java.io.IOException

class Profissionais : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profissionais)

        prof_btn_voltar.setOnClickListener {
            finish()
        }
    }


}