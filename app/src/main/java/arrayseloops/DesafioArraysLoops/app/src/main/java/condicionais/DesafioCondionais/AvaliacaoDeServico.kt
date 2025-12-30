package condicionais.DesafioCondionais

/*
DESAFIO  — Avaliação de Serviço
Variáveis:
val nota: Int   // 1 a 5

Regras:

Nota fora de 1..5 → inválida

5 → excelente

4 → bom

3 → regular

1 ou 2 → ruim*/

fun main() {
    val nota: Int = 1  // 1 a 5

    if (nota > 5 || nota < 1) {
        println("nota inválida")
    } else if (nota in 1..2) {
        println("ruim")
    } else {
        when (nota) {
            3 -> println("regular")
            4 -> println("bom")
            else -> println("excelente")
        }
    }
}