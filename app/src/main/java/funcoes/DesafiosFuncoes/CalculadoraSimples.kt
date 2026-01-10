package funcoes.DesafiosFuncoes

/*
Desafio 8 — Calculadora simples
Crie funções separadas para realizar:
Soma
Subtração
Multiplicação
Divisão
Crie uma função principal que receba dois números e a operação desejada, retornando o resultado.*/

fun soma(numeros: IntArray): Int {
    return numeros[0] + numeros[1]
}

fun subtracao(numeros: IntArray): Int {
    return numeros[0] - numeros[1]
}

fun multiplicacao(numeros: IntArray): Int {
    return numeros[0] * numeros[1]
}

fun divisao(numeros: IntArray): Int {

    if (numeros[1] == 0) {
        println("Erro: divisão por zero")
        return 0
    }
    return numeros[0] / numeros[1]
}

fun calculadora(operacao: Int, numeros: IntArray): Int {

    return when (operacao) {
        1 -> soma(numeros)
        2 -> subtracao(numeros)
        3 -> multiplicacao(numeros)
        4 -> divisao(numeros)
        else -> 0
    }
}

fun main() {
    var valores = intArrayOf(4, 2)
   println(calculadora(4, valores))
}
