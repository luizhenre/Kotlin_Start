package funcoes.DesafiosFuncoes

/*
Desafio 4 — Contagem crescente

Crie uma função que receba um número inteiro como parâmetro e faça uma contagem de 1 até esse número.
A função não deve retornar valores, apenas executar a ação.*/


fun contagem(numeroFinal: Int) {

    for (inicio in 1..numeroFinal) {
        println(inicio)
    }
}

fun main() {
    contagem(10)
}