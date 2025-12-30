package arrayseloops.DesafioArraysLoops

/*
Desafio 5 — do while

Tema: Tentativa de login

Enunciado:
Simule um sistema que exiba:

Tentativa de acesso


pelo menos uma vez, mesmo que o acesso já esteja bloqueado.

📌 Use do while*/

fun main() {
    // Simula tentativas de login (executa pelo menos uma vez)
    var tentativas = 3

    do {
        println("Tentativa de acesso nº $tentativas")
        tentativas++
    } while (tentativas <= 3)

}