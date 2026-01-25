package com.luizh.estudos.loops.loops

/*
Desafio 3 — for com downTo

Tema: Contagem regressiva

Enunciado:
Crie uma contagem regressiva de 10 até 0.
Quando chegar ao zero, exiba:

Lançamento autorizado


📌 Use downTo*/

fun main() {
    //Realiza contagem regressiva e autoriza o lançamento
    for (contagem in 10 downTo 0){
        println(contagem)
    }
    println("Lançamento autorizado")
}