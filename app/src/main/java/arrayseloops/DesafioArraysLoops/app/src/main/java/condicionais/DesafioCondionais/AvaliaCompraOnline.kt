package condicionais.DesafioCondionais

/*
DESAFIO — Avaliação de Compra Online
Variáveis:
val valorCompra: Double
val pagamentoAprovado: Boolean

Regras:

Valor ≤ 0 → inválido

Pagamento não aprovado → compra recusada

Valor ≤ 500 → compra aprovada

Valor > 500 → compra aprovada com verificação*/

fun main() {
    val valorCompra: Double = 10000.0
    val pagamentoAprovado: Boolean = true

    if (valorCompra<=0){
        println("Valor inválido")
    }else if (!pagamentoAprovado){
        println("Pagamento não aprovado, compra recusada")
    }else{
        when{
            valorCompra<=500 -> println("Compra Aprovada")
            else -> println("Compra Aprovada com verificação")
        }
    }
}