package com.luizh.estudos.oop.desafios

/*DESAFIO 2 — Cofre Digital

Crie uma classe:
class Cofre

🎯 Requisitos:
Atributos:
senha: Int (private)
aberto: Boolean (private)

Regras:

 Começa fechado.

Método abrir(tentativa: Int): Boolean
Só abre se a senha estiver correta
Se errar, continua fechado

Método fechar(): Boolean
Só fecha se estiver aberto

Método status(): String
Retorna:
"Aberto"
"Fechado"*/

class Cofre() {
    private val senha: Int = 1530
    private var aberto: Boolean = false

    fun abrir(tentativa: Int): Boolean {
        return if (tentativa != senha) {
            false
        } else {
            aberto = true
            true
        }
    }
    fun fechar(): Boolean {
        return if (aberto) {
            aberto = false
            true
        } else false
    }
    fun status(): String {
        return if (!aberto) {
            "Fechado"
        } else "Aberto"
    }
}

fun main() {

    var tentarAbrir = Cofre()

    println("Testando acessar com senha incorreta")

    var acessar = if (tentarAbrir.abrir(1531)){
        "Cofre Aberto"
    }else "Senha incorreta"
    println(acessar)
    println("----------------------------------------")
    println("Imprimindo Status")
    println(tentarAbrir.status())

    println("----------------------------------------")

    println("Testando fechar com o cofre fechado")

    var trancar = if (tentarAbrir.fechar()){
        "Cofre fechado"
    }else "Cofre já está fechado"
    println(trancar)


    println("----------------------------------------")

    println("Testando acessar com senha correta")

    acessar = if (tentarAbrir.abrir(1530)){
        "Cofre Aberto"
    }else "Senha incorreta"
    println(acessar)

    println("----------------------------------------")
    println("Imprimindo Status")
    println(tentarAbrir.status())

    println("----------------------------------------")

    println("Testando fechar com o cofre aberto")

    trancar = if (tentarAbrir.fechar()){
        "Cofre fechado"
    }else "Cofre já está fechado"
    println(trancar)

    println("----------------------------------------")
    println("Imprimindo Status")
    println(tentarAbrir.status())

}