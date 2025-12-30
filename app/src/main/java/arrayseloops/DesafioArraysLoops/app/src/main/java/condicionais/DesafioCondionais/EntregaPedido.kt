package condicionais.DesafioCondionais

/*
DESAFIO  — Entrega de Pedido
Variáveis:
val distanciaKm: Int
val clima: String   // "normal", "chuva", "tempestade"

Regras:

Clima tempestade → entrega cancelada

Distância até 5km → entrega rápida

Distância de 6 a 15km → entrega normal

Distância acima de 15km → entrega demorada*/


fun main() {
    val distanciaKm: Int = 20
    val clima: String = "tempestade"  // "normal", "chuva", "tempestade"

    if (clima == "tempestade") {
        println("entrega cancelada")
    } else if (distanciaKm <= 5) {
        println("Entrega rápida")
    } else if (distanciaKm in 6..15) {
        println("Entrega normal")
    } else {
        println("Entrega demorada")
    }
}

