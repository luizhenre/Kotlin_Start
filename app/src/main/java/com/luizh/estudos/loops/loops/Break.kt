package com.luizh.estudos.loops.loops

/*
Desafio 7 — break

Tema: Monitoramento de erro

Enunciado:
Percorra os números de 1 a 30.
Quando o número 17 for encontrado, interrompa o loop e exiba:

Erro crítico detectado


📌 Use break*/

fun main() {
    //contando de 1 ao 30 encerrando contagem quanto encontrado número 17
    for (contador in 1..30){
        if (contador==17)break
        println(contador)
    }
    println("Erro crítico detectado")
}