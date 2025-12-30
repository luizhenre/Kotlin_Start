package arrayseloops.DesafiosArraysLoops

/*
🟢 Desafio 5 — Contar Números Pares

Objetivo:
Contar quantos números pares existem em um array.

Entrada exemplo:

val numeros = intArrayOf(1,2,3,4,5,6,7,8)


Saída esperada:

Quantidade de números pares: 4*/

fun main() {
    val numeros = intArrayOf(1,2,3,4,5,6,7,8)
    var acumulador = 0
    //Percorre todas posições, contando apenas os números pares
    for (contador in numeros){
        if (contador%2==0){
            acumulador++
        }
    }
    println("Quantidade de números pares: $acumulador")
}