package condicionais.DesafioCondionais

/*
DESAFIO H — Classificação de Senha
Variáveis:
val tamanhoSenha: Int

Regras:

Tamanho ≤ 0 → inválido

< 6 → senha fraca

6 a 10 → senha média

10 → senha forte*/

fun main() {
    val tamanhoSenha: Int = 11

    if (tamanhoSenha <= 0) {
        println("Inválido")
    } else {
        when (tamanhoSenha) {
            in 1..5 -> println("Senha Fraca")
            in 6..10 -> println("Senha Média")
            else -> println("Senha Forte")
        }
    }
}
