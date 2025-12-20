package condicionais.DesafioCondionais

/*
DESAFIO F — Controle de Acesso ao Estacionamento
Variáveis:
val tipoVeiculo: String   // "carro", "moto", "caminhao"

Regras:

Tipo inválido → acesso negado

carro ou moto → acesso permitido

caminhão → acesso restrito*/

fun main() {
    val tipoVeiculo: String = ""  // "carro", "moto", "caminhao"

    when(tipoVeiculo){
        "carro", "moto" -> println("acesso permitido")
        "caminhão" -> println("acesso restrito")
        else -> println("acesso negado")
    }
}