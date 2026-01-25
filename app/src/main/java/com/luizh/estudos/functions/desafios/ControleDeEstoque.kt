package com.luizh.estudos.functions.desafios

/*
🧩 Desafio 10 — Sistema de Controle de Estoque
📌 Tema

Você está criando um pequeno sistema para uma loja que precisa calcular informações sobre o estoque de produtos.
🎯 Requisitos do desafio

Você deve criar funções que:
1️ Recebam um IntArray representando as quantidades em estoque de vários produtos
Exemplo:
intArrayOf(10, 5, 0, 20, 8)

2️ Uma função deve retornar:
O total de produtos no estoque (soma de tudo)

3️ Outra função deve retornar:
A quantidade de produtos que estão em falta (valor = 0)

4️ Outra função deve retornar:
A quantidade de produtos com estoque baixo (quantidade menor que 5)

5️ A main deve:
Criar o array
Chamar as funções
Exibir os resultados

📌 Importante
Cada responsabilidade deve estar em uma função
Nada de tudo em uma função só
Nenhuma função deve pedir dados ao usuário*/


fun totalProdutos(dados: IntArray): Int{
    var soma=0
     for (contagem in dados){
         soma += contagem
    }
    return soma
}

fun produtosEmFalta(dados: IntArray): Int{
    var contador: Int = 0
    for (acumulador in dados){
        if (acumulador==0) contador +=1
    }
    return contador
}
fun baixaQuantidade(dados: IntArray): Int{
    var contador: Int = 0
    for (acumulador in dados){
        if (acumulador in 1..4) contador +=1 //usado "in" para não contabilizar "0"
    }
    return contador
}

fun main() {
    val produtosEstoque= intArrayOf(10,50,20,5,0,12,15,0,3,4)
    println(totalProdutos(produtosEstoque))
    println(produtosEmFalta(produtosEstoque))
    println(baixaQuantidade(produtosEstoque))
}