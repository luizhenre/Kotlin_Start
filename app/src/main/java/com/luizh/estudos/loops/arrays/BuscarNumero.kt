package com.luizh.estudos.loops.arrays

/*
🟢 Desafio 7 — Buscar Número

Objetivo:
Verificar se um número específico existe dentro do array.

Entrada exemplo:

val numeros = intArrayOf(10, 20, 30, 40)
val procurado = 30

Saída esperada:

Número 30 encontrado
Ou:
Número 30 não encontrado*/

fun main() {
    val numeros = intArrayOf(10, 20, 30, 40)
    val procurado = 30
    var encontrado = false
    // Rastreia o valor solicitado, encerra o loop com break quando encontrado
    for (rastreador in numeros){
        if (rastreador==procurado){
            encontrado=true
            break
        }
    }
    if (encontrado){
        println("Número $procurado encontrado!")
    }else{
        println("Número $procurado não encontrado!")
    }
}