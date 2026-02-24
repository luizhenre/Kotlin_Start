package com.luizh.estudos.oop.desafios

/*
DESAFIO 1 — Herança (Funcionários)
Crie:
Classe base:
Funcionario

Atributos:
nome
salario (protected)

Métodos:
calcularBonus(): Double
→ bônus padrão = 10% do salário

Classe filha:
Gerente
Deve herdar de Funcionario

Sobrescrever calcularBonus()
→ bônus = 20% do salário

Testes obrigatórios na main:
Criar um Funcionario
Criar um Gerente
Mostrar o bônus de cada um*/


open class Funcionario(
    open val nome: String,
    protected open var salario: Double
) {
    open fun calcularBonus(): Double {
        return (salario * 10) / 100
    }

}

class Gerente(
    override val nome: String,
    override var salario: Double
) : Funcionario(nome, salario) {

    override fun calcularBonus(): Double {
        return (salario * 20) / 100
    }
}

fun main() {

    var colaborador = Funcionario("Marcos", 2000.00)
    println("O bônus do colaborador ${colaborador.nome} é de ${colaborador.calcularBonus()}")

    println("---------------------------------------------------------")

    var gerente = Gerente("Paula", 3000.00)
    println("O bônus da gerente ${gerente.nome} é de ${gerente.calcularBonus()}")

}