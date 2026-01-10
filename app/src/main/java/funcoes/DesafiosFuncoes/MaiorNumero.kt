package funcoes.DesafiosFuncoes

/*
Desafio 2 — Maior número

Crie uma função que receba um array de números inteiros e retorne o maior valor encontrado.
Não utilize funções prontas da linguagem para encontrar o maior número.*/

fun maiorNumero(numeros: IntArray): Int {
    var maior = numeros[0]

    for (numero in numeros) {
        if (numero > maior) {
            maior = numero
        }
    }
    return maior
}

fun main() {
    val numeros = intArrayOf(10, 20, 30, 40, 50)
    println(maiorNumero(numeros))
}
