package com.luizh.estudos.terminal.miniprojetos.estoque

val menu = arrayListOf(
    "1 - Ver total de produtos no estoque",
    "2 - Ver quantos produtos estão em falta (0)",
    "3 - Ver produtos com baixo estoque (1 a 4)",
    "4 - Atualizar quantidade de um produto",
    "5 - Listar todos os produtos",
    "0 - Sair"
)
fun exibirMenu(menu: ArrayList<String>) {

    do {
        println("===== CONTROLE DE ESTOQUE =====")
        for (indicador in menu) {
            println(indicador)
        }
        println("Informe a opção desejada: ")
        var opcao = readln().toInt()//converte entrada de string para int

        when (opcao) {//agora opcao convertido em int para uso do when
            1 -> println("Total de produtos: ${totalProdutos(produtosEstoque)}")
            2 -> println("Produtos em falta: ${produtosEmFalta(produtosEstoque)}")
            3 -> println("Produtos com baixa quantidade: ${baixaQuantidade(produtosEstoque)}")
            4 -> atualizarEstoque(produtosEstoque)
            5 -> listarProdutos(produtosEstoque)
            0 -> println("Sistema Finalizado")
        }

    } while (opcao != 0)

}

