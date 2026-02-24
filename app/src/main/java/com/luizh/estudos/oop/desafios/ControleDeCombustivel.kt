package com.luizh.estudos.oop.desafios

/*DESAFIO 3 — Controle de Combustível

Crie uma classe:
class TanqueCombustivel

🎯 Requisitos:
Atributos:
capacidadeMaxima: Double
nivelAtual: Double (private)

Regras:

1️⃣ Começa com 0 de combustível
2️⃣ Não permitir capacidade menor ou igual a 0

3️⃣ Método abastecer(valor: Double): Boolean
Não pode ultrapassar capacidade
Não pode aceitar valor <= 0

4️⃣ Método consumir(valor: Double): Boolean
Não pode consumir mais que o disponível
Não pode aceitar valor <= 0

5️⃣ Método nivel(): Double
Retorna o nível atual*/

class TanqueCombustivel() {

    private var nivelAtual: Double = 0.0
    private var capacidadeMaxima: Double = 1000.00


    fun abastecer(valor: Double): Boolean {
        return if (valor + nivelAtual > capacidadeMaxima || valor <= 0) {
            false
        } else {
            nivelAtual += valor
            true
        }
    }
    fun consumir(valor: Double): Boolean {
        return if (valor > nivelAtual || valor <= 0) {
            false
        } else {
            nivelAtual -= valor
            true
        }
    }
    fun nivel(): Double {
        return nivelAtual
    }
}

fun main() {
    var manuseioCombustivel = TanqueCombustivel()
    println("Testando abastecimento")
    var abastecendo = if (manuseioCombustivel.abastecer(100.0)) {
        "Tanque Abastecido"
    } else "Para abastecer a quantidade deve ser maior que 0.0 e não ultrapassar o limite!"
    println(abastecendo)
    println("--------------------------------------------------------------------------")

    println("Imprimindo Nivel Atual")
    println(manuseioCombustivel.nivel())

    println("--------------------------------------------------------------------------")
    println("Testando Consumo")
    var consumo = if (manuseioCombustivel.consumir(10.0)) {
        "Combustivel Consumido"
    } else "Consumo deve ser maior que 0 e não ultrapassar o limite"
    println(consumo)

    println("--------------------------------------------------------------------------")
    println("Imprimindo Nivel Atual")
    println(manuseioCombustivel.nivel())

    println("--------------------------------------------------------------------------")
    println("Testando abastecimento negativo")
    abastecendo = if (manuseioCombustivel.abastecer(-1000.0)) {
        "Tanque Abastecido"
    } else "Para abastecer a quantidade deve ser maior que 0.0 e não ultrapassar o limite!"
    println(abastecendo)

    println("--------------------------------------------------------------------------")
    println("Testando Consumo negativo")
    consumo = if (manuseioCombustivel.consumir(-100.0)) {
        "Combustivel Consumido"
    } else "Consumo deve ser maior que 0 e não ultrapassar o limite"
    println(consumo)
}