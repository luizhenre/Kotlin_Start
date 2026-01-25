package com.luizh.estudos.loops.loops

/*
Desafio 8 — continue

Tema: Filtro de dados inválidos

Enunciado:
Imprima os números de 1 a 20, exceto os múltiplos de 4.

📌 Use continue*/

fun main() {
    //conta de 1 ao 20 pulando números múltiplos de 4
    for (dadosValidos in 1..20){
        if (dadosValidos%4==0)continue
        println(dadosValidos)
    }
}