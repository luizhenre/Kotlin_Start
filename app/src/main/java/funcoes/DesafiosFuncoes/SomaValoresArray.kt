package funcoes.DesafiosFuncoes

/*
Desafio 5 — Soma de valores do array

Crie uma função que receba um array de números inteiros e retorne a soma total dos valores.*/

fun somaArray(numIntArray: IntArray): Int{
    var soma = 0

    for (contador in numIntArray) soma+= contador
    return soma
}

fun main() {
    val numInt = intArrayOf(10,20,30,40)
    println(somaArray(numInt))
}