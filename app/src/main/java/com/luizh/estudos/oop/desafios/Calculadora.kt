package com.luizh.estudos.oop.desafios

/*DESAFIO 3 — Sobrecarga (Calculadora)

Crie classe:
Calculadora

Crie métodos somar() sobrecarregados:
somar(Int, Int)
somar(Double, Double)
somar(Int, Int, Int)

Todos retornam o resultado.

Testar todos na main.*/

class Calculadora {

    fun somar(valor1: Int, valor2: Int): Int {
        return valor1 + valor2
    }
    fun somar(valor1: Double, valor2: Double): Double {
        return valor1 + valor2
    }
    fun somar(valor1: Int, valor2: Int, valor3: Int): Int {
        return valor1 + valor2 + valor3
    }
}

fun main() {
    var calculo = Calculadora()
    println(calculo.somar(1,1))
    println(calculo.somar(2.2,2.2))
    println(calculo.somar(1,1,1))
}