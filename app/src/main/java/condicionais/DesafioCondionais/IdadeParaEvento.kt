package condicionais.DesafioCondionais

/*
DESAFIO  — Classificação de Idade para Evento
Variáveis:
val idade: Int

Regras:

Idade < 0 → inválida

< 12 → infantil

12 a 17 → juvenil

≥ 18 → adulto*/

fun main() {
    val idade: Int = 18

    if (idade < 0) {
        println("inválida")
    } else {
        when {
            idade<12 -> println("infantil")
            idade in 12..17 -> println("juvenil")
            else -> println("adulto")
        }
    }
}