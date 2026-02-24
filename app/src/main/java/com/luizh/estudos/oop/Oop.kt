/*
package com.luizh.estudos.oop


enum class Status{
    FUNCIONAMENTO,
    MANUTENCAO,
    QUEBRADO,
}
open class Veiculo(
    var nome: String = "",
    var qtdRodas: Int = 0,
    var status: Status = Status.FUNCIONAMENTO
){

    open fun acelerar(){
        print("Acelerando ")
    }
    fun acelerar(velocidade: Int = 0){
        println("Acelerando $nome com $qtdRodas rodas a $velocidade km/h ")
    }

    fun recuperarStatus(status: Status){
        println("O status do veículo é: ${status}")
    }

    companion object{
        const val VELOCIDADE_MAX_PERMITIDA = 120
        fun exibirMensagemVelocidadeMaxima(){
            println("A velocidade máxima é: $VELOCIDADE_MAX_PERMITIDA")
        }

    }

}



interface Eletrificado{
    fun motorEletrico(){
        println("Rodando com motor elétrico")
    }
}

class Carro: Veiculo(){
    override fun acelerar() {
        super.acelerar()
        println("$nome com $qtdRodas rodas")
    }

}
class Moto: Veiculo(), Eletrificado{


    override fun acelerar() {
        */
/*super.acelerar()*//*

        */
/*println("$nome com $qtdRodas rodas")*//*

        motorEletrico()
    }

}

fun main() {
    var carro = Carro()
    carro.nome = "BMW"
    carro.qtdRodas = 4
    carro.acelerar(120)
    carro.recuperarStatus(Status.FUNCIONAMENTO)
    Veiculo.exibirMensagemVelocidadeMaxima()

    println("----------------------------------------")

    var moto = Moto()
    moto.nome = "Kawasaki"
    moto.qtdRodas = 2
    moto.acelerar()
    Veiculo.exibirMensagemVelocidadeMaxima()
}*/
