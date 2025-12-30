package arrayseloops.DesafioArraysLoops.Arrays

/*
🟢 Desafio 8 — Contar Ocorrências

Objetivo:
Contar quantas vezes um número aparece no array.

Entrada exemplo:

val numeros = intArrayOf(10, 20, 10, 30, 10)

Saída esperada:

O número 10 aparece 3 vezes*/

fun main() {
    val numeros = intArrayOf(10, 20, 10, 30, 10)
    val procurado = 10
    var acumulador = 0
    // Percorre o array registrando quantas vezes encontrou o valor procurado
    for (contador in numeros){
        if (contador==procurado) acumulador++
    }
    println("O número $procurado aparece $acumulador vezes")
}