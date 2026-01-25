package com.luizh.estudos.functions.desafios

/*
🧩 Desafio 9 — Média de notas

Crie uma função que receba um array de notas (Double) e retorne a média final.
A função deve apenas calcular e retornar o valor.*/


fun media(notas: DoubleArray): Double{
    var acumulador= 0.0
    for (totalNotas in notas){
        acumulador += totalNotas
    }
    return acumulador / notas.size
}

fun main() {
    val notas = doubleArrayOf(6.5,3.5,2.5,2.6,3.2,4.0,3.5)
    println(String.format("%.2f", media(notas)))
}