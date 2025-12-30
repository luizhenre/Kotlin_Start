package arrayseloops.DesafiosArraysLoops

/*
🟢 Desafio 6 — Maior Número do Array

Objetivo:
Identificar e exibir o maior número dentro de um array.

Regras:

Não usar max()

Entrada exemplo:

val numeros = intArrayOf(5, 18, 3, 12)


Saída esperada:

Maior número: 18*/

fun main() {
    val numeros = intArrayOf(5, 18, 3, 12)
    var maiorNum = numeros[0]
    //Percorre todos os valores, armazena apenas o maior número
    for (identificador in numeros){
        if (identificador>maiorNum) maiorNum = identificador
    }
    println("Maior número: $maiorNum")
}