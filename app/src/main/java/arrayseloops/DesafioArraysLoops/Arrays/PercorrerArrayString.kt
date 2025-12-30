package arrayseloops.DesafioArraysLoops.Arrays

/*
🟢 Desafio 2 — Percorrer Array de Strings

Objetivo:
Exibir todos os nomes armazenados em um array de strings.

Entrada exemplo:

val nomes = arrayOf("Ana", "Carlos", "Beatriz", "João")


Saída esperada:

Ana
Carlos
Beatriz
João*/

fun main() {
    val nomes = arrayOf("Ana", "Carlos", "Beatriz", "João")

    for (nome in nomes){
        println(nome)
    }
}
