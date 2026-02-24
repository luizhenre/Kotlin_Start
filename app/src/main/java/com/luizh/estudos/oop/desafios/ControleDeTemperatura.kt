package com.luizh.estudos.oop.desafios

/*
DESAFIO 5 — Controle de Temperatura

Crie uma classe:
class Termostato

🎯 Requisitos:
Atributos:
temperaturaAtual: Int (private)
temperaturaMinima: Int
temperaturaMaxima: Int

Regras:
1️⃣ Não permitir mínimo maior que máximo

2️⃣ Método aumentar(valor: Int): Boolean
Não pode ultrapassar máximo

3️⃣ Método diminuir(valor: Int): Boolean
Não pode ficar abaixo do mínimo

4️⃣ Método temperatura(): Int
Retorna a temperatura atual*/

class Termostato() {
    private var temperaturaAtual: Int = 15
    val temperaturaMinima: Int = 15
    val temperaturaMaxima: Int = 40

    fun aumentar(valor: Int): Boolean {
        return if (valor + temperaturaAtual > temperaturaMaxima || valor > temperaturaMaxima || valor <= 0) {
            false
        } else {
            temperaturaAtual += valor
            true
        }
    }

    fun diminuir(valor: Int): Boolean {
        return if (temperaturaAtual - valor !in temperaturaMinima..temperaturaMaxima || valor <= 0 || valor > temperaturaMaxima) {
            false
        } else {
            temperaturaAtual -= valor
            true
        }
    }

    fun temperatura(): Int {
        return temperaturaAtual
    }
}

fun main() {
    var termometro = Termostato()

    println("Testando esquentar:")
    var quente = if (termometro.aumentar(1)) {
        "Aumentando temperatura"
    } else "Temperatura máxima permitida é de ${termometro.temperaturaMaxima} graus e miníma ${termometro.temperaturaMinima} graus!"
    println(quente)
    println("------------------------------------------")

    print("Temperatura:")
    println(termometro.temperatura())
    println("------------------------------------------")

    println("Testando diminuir:")
    var frio = if (termometro.diminuir(1)) {
        "Diminuindo termperatura"
    } else "Temperatura máxima permitida é de ${termometro.temperaturaMaxima} graus e miníma ${termometro.temperaturaMinima} graus!"
    println(frio)
    println("------------------------------------------")

    print("Temperatura:")
    println(termometro.temperatura())
}