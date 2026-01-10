package funcoes.DesafiosFuncoes

/*Desafio 7 — Relatório de números
Crie funções separadas para:
Exibir números de 1 a 10
Exibir apenas números pares de 1 a 10
Exibir apenas números ímpares de 1 a 10
Crie uma função principal que receba uma opção e chame a função correspondente.*/

//Exibe números de 1 a 10
fun exibeAte10(valor: IntArray) {
    for (contador in valor) {
        println(contador)
    }
}

//Exibe apenas números pares de 1 a 10
fun exibePares(valor: IntArray) {
    for (contador in valor) {
        if (contador % 2 == 0) {
            println(contador)
        }
    }
}

//Exibe apenas números ímpares de 1 a 10
fun exibeImpares(valor: IntArray) {
    for (contador in valor) {
        if (contador % 2 != 0) {
            println(contador)
        }
    }
}

//Função principal que recebe uma opção e chama a função correspondente
fun menu(opcao: Int, numeros: IntArray) {
    when(opcao) {
        1 -> exibeAte10(numeros)
        2 -> exibePares(numeros)
        3 -> exibeImpares(numeros)
        else -> println("Opção inválida")
    }
}

fun main() {
    val numeros = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    menu(1, numeros)
}