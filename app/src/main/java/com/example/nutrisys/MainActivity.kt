package com.example.nutrisys

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.nutrisys.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCadastro.setOnClickListener {
            val navegarSegundaTela = Intent(this, Cadastro::class.java)
            startActivity(navegarSegundaTela)
        }
        /*Lgoin*/
        binding.btnLogin.setOnClickListener {
            val navegarTelaLogin = Intent(this, Login::class.java)
            startActivity(navegarTelaLogin)
        }
    }

    private fun callCadastro(){
        val segundaTela = Intent(this, Cadastro::class.java)
        startActivity(segundaTela)
    }
    /*Login*/
    private fun callLogin(){
        val telaLogin = Intent(this, Login::class.java)
        startActivity(telaLogin)
    }
}