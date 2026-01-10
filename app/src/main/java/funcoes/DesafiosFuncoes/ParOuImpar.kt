package funcoes.DesafiosFuncoes

/*
Desafio 3 — Número par ou ímpar

Crie uma função que receba um número inteiro e retorne uma mensagem informando se o número é par ou ímpar.*/


fun parOuImpar(numero: Int): String {
    var resultado: String
    if (numero % 2 == 0) resultado = "Par" else resultado = "Impar"
    return resultado
}

fun main() {
    println(parOuImpar(3))
}