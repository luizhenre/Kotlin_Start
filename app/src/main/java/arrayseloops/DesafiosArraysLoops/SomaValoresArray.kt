package arrayseloops.DesafiosArraysLoops

/*
🟢 Desafio 4 — Soma dos Valores

Objetivo:
Somar todos os números de um array e exibir o total.

Entrada exemplo:

val valores = intArrayOf(10, 20, 30)


Saída esperada:

Soma total: 60*/

fun main() {
    val valores = intArrayOf(10, 20, 30)
    var soma = 0
    //percorre e soma todas posições do array
    for (acumulador in valores){
        soma += acumulador
    }
    println(soma)
}