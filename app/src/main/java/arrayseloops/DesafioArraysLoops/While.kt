package arrayseloops.DesafioArraysLoops

/*
Desafio 4 — while

Tema: Controle de estoque

Enunciado:
Um estoque começa com 100 unidades.
Enquanto houver produtos, imprima a quantidade restante, reduzindo 1 unidade por ciclo.

📌 Use while*/

fun main() {
    //Conta e exibi a quantidade de produtos de 100 a 0
    var estoqueProduto = 100

    while (estoqueProduto > 0) {
        println("Quantidade de produtos no estoque: $estoqueProduto")
        estoqueProduto--
    }
}