package com.example.aplicativonutrisys

class Usuario {
    private var nomeDoUsuario: String = ""
    private var emailDoUsuario: String = ""
    private var senhaDoUsuario: String = ""
    private var telefoneDoUsuario: String = ""

    fun getNomeDoUsuario(): String {
        return this.nomeDoUsuario
    }

    fun getEmailDoUsuario(): String {
        return this.emailDoUsuario
    }

    fun getSenhaDoUsuario(): String {
        return this.senhaDoUsuario
    }

    fun getTelefoneDoUsuario(): String{
        return this.telefoneDoUsuario
    }

    fun setNomeDoUsuario(variavel: String){
        this.nomeDoUsuario = variavel
    }

    fun setSenhaDoUsuario(variavel: String){
        this.senhaDoUsuario = variavel
    }

    fun setEmailDoUsuario(variavel: String){
        this.emailDoUsuario = variavel
    }

    fun setTelefoneDoUsuario(variavel: String){
        this.telefoneDoUsuario = variavel
    }
}