package com.luizh.estudos.oop.desafios

/*
DESAFIO 1 — Classe Carro
📌 Crie a classe Carro
🔹 Atributos:
marca: String
modelo: String
private var velocidade: Int

🔹 Métodos:

1️⃣ acelerar(valor: Int): Boolean
Só permite valor positivo
Aumenta a velocidade
Retorna true se sucesso

2️⃣ frear(valor: Int): Boolean
Não pode frear valor negativo
Não pode deixar velocidade abaixo de 0
Retorna true se sucesso

3️⃣ velocidadeAtual(): Int
Retorna a velocidade atual

🎯 Main:
Criar um carro
Acelerar
Frear
Mostrar velocidade
Testar erro (frear mais do que a velocidade)*/

class Carro(
    //atributos
    val marca: String,
    val modelo: String,
    private var velocidade: Int
) {
    //métodos
    fun acelerar(aumentarVelocidade: Int): Boolean {
        return if (aumentarVelocidade > velocidade) {
            velocidade += aumentarVelocidade
            true
        } else false
    }
    fun frear(diminuirVelocidade: Int): Boolean {
        return if (diminuirVelocidade in 1..velocidade){
            velocidade -= diminuirVelocidade
            true
        }else false
    }
    fun velocidadeAtual(): Int {
        return velocidade
    }
}

fun main() {
    var astra = Carro("Chevrolet", "Astra", 0)

    var aceleracao = if (astra.acelerar(120)) {
        "Acelerando ${astra.modelo} a ${astra.velocidadeAtual()} km/h."
    } else "Aceleracão deve ser maior que ${astra.velocidadeAtual()}."
    println(aceleracao)
    println("------------------------------------------------------")

    var freando = if (astra.frear(20)){
        "Freando até chegar na velocidade ${astra.velocidadeAtual()} km/h."
    }else "Para frear o carro deve ser maior ou igual a zero, respeitando a velocidade atual."
    println(freando)
    println("------------------------------------------------------")

    println("${astra.modelo} da marca ${astra.marca} está andando em ${astra.velocidadeAtual()} km/h.")
    println("------------------------------------------------------")

    var testeDeErro = if (astra.frear(200)){
        "Freando até chegar na velocidade ${astra.velocidadeAtual()} km/h."
    }else "Para frear o carro deve ser maior ou igual a zero, respeitando a velocidade atual."
    println(testeDeErro)
}
