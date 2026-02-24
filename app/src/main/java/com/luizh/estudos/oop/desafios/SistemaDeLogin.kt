package com.luizh.estudos.oop.desafios

/*
DESAFIO 4 — Sistema de Login

Crie uma classe:
class Usuario

🎯 Requisitos:
Atributos:
login: String
senha: String (private)
logado: Boolean (private)

Regras:
1️⃣ Começa deslogado

2️⃣ Método entrar(loginDigitado: String, senhaDigitada: String): Boolean
Só loga se ambos estiverem corretos

3️⃣ Método sair(): Boolean
Só permite sair se estiver logado

4️⃣ Método status(): String
Retorna:
"Online"
"Offline"*/

class Usuario() {
    private val login: String = "teste"
    private val senha: String = "teste@teste"
    private var logado: Boolean = false
    fun entrar(loginDigitado: String, senhaDigitada: String): Boolean {
        return if (loginDigitado != login || senhaDigitada != senha || logado) {
            false
        } else {
            logado = true
            true
        }
    }
    fun sair(): Boolean {
        return if (logado == false) {
            false
        } else {
            logado = false
            true
        }
    }
    fun status(): String {
        return if (logado == true) "Online" else "Offline"
    }
}

fun main() {
    var login1 = Usuario()
    println("Testando impressão de status:")
    println(login1.status())
    println("------------------------------------------------------------")

    println("Testando sistema de longin com dados corretos:")
    var validacao = if (login1.entrar("teste", "teste@teste")) {
        "Usuário Online"
    } else "Login ou senha está incorreto ou já está logado!"
    println(validacao)
    println("------------------------------------------------------------")

    println("Testando sistema de login com usuário já Online:")
    validacao = if (login1.entrar("teste", "teste@teste")) {
        "Usuário Online"
    } else "Login ou senha está incorreto ou já está logado!"
    println(validacao)
    println("------------------------------------------------------------")

    println(login1.status())
    println("------------------------------------------------------------")

    println("Testando sistema de logout:")
    var logout = if (login1.sair()) {
        "Usuário Desconectado!"
    } else "Usuário já está Desconectado!"
    println(logout)
    println("------------------------------------------------------------")

    println(login1.status())
    println("------------------------------------------------------------")

    println("Testando sair com usuário já offline:")
    logout = if (login1.sair()) {
        "Usuário Desconectado!"
    } else "Usuário já está Desconectado!"
    println(logout)
    println("------------------------------------------------------------")

    println("Testando login com dados incorretos:")
    validacao = if (login1.entrar("errado", "errado@errado")) {
        "Usuário Online"
    } else "Login ou senha está incorreto ou já está logado!"
    println(validacao)
    println("------------------------------------------------------------")
}