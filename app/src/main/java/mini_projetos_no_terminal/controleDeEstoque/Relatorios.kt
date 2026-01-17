package mini_projetos_no_terminal.controleDeEstoque

fun totalProdutos(dados: IntArray): Int {
    var soma = 0
    for (contagem in dados) {
        soma += contagem
    }
    return soma
}

fun produtosEmFalta(dados: IntArray): Int {
    var contador = 0
    for (acumulador in dados) {
        if (acumulador == 0) contador += 1
    }
    return contador
}

fun baixaQuantidade(dados: IntArray): Int {
    var contador = 0
    for (acumulador in dados) {
        if (acumulador in 1..4) contador += 1// in 1..4 para não contar produtos zero estoque
    }
    return contador
}

fun listarProdutos(dados: IntArray) {
    for ((indice, i) in dados.withIndex()) {
        println("Produto $indice: $i")
    }
}


