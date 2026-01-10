package funcoes.DesafiosFuncoes

/*
Desafio 6 — Contagem de pares

Crie uma função que receba um array de números inteiros e retorne quantos números pares existem no array.*/


fun somentePar(numeros: IntArray): Int {
    var acumulador = 0

    for (contador in numeros) {
        if (contador % 2 == 0) acumulador++
    }
    return acumulador
}

fun main() {
    val numPar = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(somentePar(numPar))
}