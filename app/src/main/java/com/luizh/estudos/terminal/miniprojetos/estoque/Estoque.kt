package com.luizh.estudos.terminal.miniprojetos.estoque

var produtosEstoque = intArrayOf(10, 50, 20, 5, 0, 12, 15, 0, 3, 4)
fun atualizarEstoque(dados: IntArray){

    println("Informe o índice do produto que deseja alterar:")
    val produto = readln().toInt()

    if (produto < 0 || produto >= dados.size) {
        println("Produto inválido!")
        return
    }

    println("Informe a nova quantidade:")
    val novaQuantidade = readln().toInt()

    dados[produto] = novaQuantidade
    println("Quantidade do produto $produto atualizada para $novaQuantidade")
}
