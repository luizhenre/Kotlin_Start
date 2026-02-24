package com.luizh.estudos.oop.desafios

/*
Sistema de Estacionamento
Crie uma classe:
class Estacionamento

🎯 Requisitos:
Atributos:
capacidadeMaxima: Int
vagasOcupadas: Int (private)

Regras:

 Ao criar o estacionamento:
vagasOcupadas começa em 0
Não permitir capacidade menor ou igual a 0

 Método entrarCarro(): Boolean
Só permite entrar se houver vaga
Incrementa vagasOcupadas
Retorna true se conseguiu
Retorna false se estiver lotado

 Método sairCarro(): Boolean
Só permite sair se houver carro
Decrementa vagasOcupadas
Retorna true se conseguiu
Retorna false se estiver vazio

 Método status(): String
Deve retornar algo como:
"5/10 vagas ocupadas"*/

class Estacionamento(
    val capacidadeMaxima: Int,
    private var vagasOcupadas: Int = 0
) {
    init {
        require(vagasOcupadas >= 0) {
            "Vagas ocupadas deve ser maior que zero!"
        }
    }
    fun entrarCarro(): Boolean {
        return if (capacidadeMaxima > vagasOcupadas) {
            vagasOcupadas++
            true
        } else false
    }
    fun sairCarro(): Boolean {
        return if (vagasOcupadas>0){
            vagasOcupadas--
            true
        }else false
    }
    fun status(): String {
        return if (capacidadeMaxima > vagasOcupadas) {
            "$vagasOcupadas/$capacidadeMaxima vagas ocupadas"
        } else "Estacionamento lotado"
    }
}

fun main() {

    var carrosluxo = Estacionamento(1)

    var carro1 = if (carrosluxo.entrarCarro()) {
        "Carro estacionado"
    } else "Estacionamento lotado!"

    println(carro1)

    println("---------------------------")
    println("Testando colocar mais um carro em um estacionamento já lotado")
    var carro2 = if (carrosluxo.entrarCarro()) {
        "Carro estacionado"
    } else "Estacionamento lotado!"

    println(carro2)

    println("---------------------------")
    println("Testando saida de status")
    println(carrosluxo.status())

    println("---------------------------")
    println("Testando saida de estacionamento")
    var carro2saindo = if (carrosluxo.sairCarro()){
        "Carro liberado"
    }else "Estacionamento está vazio"
    println(carro2saindo)

    println("---------------------------")
    println("Testando saida de status")
    println(carrosluxo.status())

}