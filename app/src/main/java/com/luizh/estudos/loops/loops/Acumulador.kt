package com.luizh.estudos.loops.loops

/*
🔹 Desafio 9 — Acumulador (soma)

Tema: Relatório financeiro

Enunciado:
Calcule a soma de todos os números pares entre 1 e 100
Ao final, exiba o valor total.

📌 Use loop + acumulador*/

fun main() {
    // soma todos os números pares entre 1 e 100
    var soma = 0
    for (contador in 1..100) {
        if (contador % 2 == 0) soma += contador
    }
    println("A soma de todos os números pares de 1 ao 100 é $soma")
}