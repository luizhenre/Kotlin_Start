package com.luizh.estudos.loops.loops

/*
Desafio 10 — Contador por condição

Tema: Análise de sistema

Enunciado:
Conte quantos números entre 1 e 50 são múltiplos de 5
Exiba o total encontrado.

📌 Use contador (count++)*/

fun main() {
    // Exibe a quantidade de números múltiplos de 5 de 1 a 50
    var contador = 1
    var multiplos = 0

    while (contador <= 50) {
        if (contador % 5 == 0) {
            multiplos++
        }
        contador++
    }

    println("O total de números múltiplos de 5 entre 1 e 50 é $multiplos")


}