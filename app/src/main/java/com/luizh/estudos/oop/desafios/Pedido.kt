package com.luizh.estudos.oop.desafios

/*
DESAFIO 2 — Enum (Pedido)

Crie:

enum class StatusPedido
Valores:
PENDENTE
PAGO
ENVIADO
CANCELADO

Crie classe:
Pedido

Atributos:
numero
status (começa como PENDENTE)

Métodos:
pagar()
enviar()
cancelar()
statusAtual()

Regras:

Só pode enviar se estiver PAGO
Não pode pagar se estiver CANCELADO
Não pode cancelar se já estiver ENVIADO
Todos os métodos devem retornar Boolean.*/

enum class StatusPedido {
    PENDENTE,//0
    PAGO,//1
    ENVIADO,//2
    CANCELADO//3
}

class Pedido(var numero: Int) {
    private var status: StatusPedido = StatusPedido.PENDENTE

    fun pagar(): Boolean {
        return if (status != StatusPedido.PENDENTE) {
            false
        } else {
            status = StatusPedido.PAGO
            true
        }
    }
    fun enviar(): Boolean {
        return if (status != StatusPedido.PAGO) {
            false
        } else {
            status = StatusPedido.ENVIADO
            true
        }
    }

    fun cancelar(): Boolean {
        return if (status!= StatusPedido.ENVIADO|| status == StatusPedido.CANCELADO) {
            false
        } else {
            status = StatusPedido.CANCELADO
            true
        }
    }
    fun statusAtual(): String {
        return status.name
    }
}

fun main() {
    var pedido1 = Pedido(255)
    println("Simulando que o pedido já foi pago:")
    var clientePedido1 = if (pedido1.pagar()) {
        "Pedido ${pedido1.numero} pago e pronto para envio!"
    } else "Pedido ${pedido1.numero} Cancelado"
    println(clientePedido1)
    println("----------------------------------------")

    println("Mostrando Status do pedido:")
    println(pedido1.statusAtual())
    println("----------------------------------------")

    println("Testando enviar pedido:")
    clientePedido1 = if (pedido1.enviar()) {
        "Pedido ${pedido1.numero} Enviado!"
    } else "Não consta pagamento para enviar o pedido ${pedido1.numero}!"
    println(clientePedido1)
    println("----------------------------------------")

    println("Mostrando Status do pedido:")
    println(pedido1.statusAtual())
    println("----------------------------------------")

    println("Testando Cancelar pedido:")
    clientePedido1 = if (pedido1.cancelar()) {
        "Pedido ${pedido1.numero} Cancelado!"
    } else "O Pedido ${pedido1.numero} não pode ser cancelado!"
    println(clientePedido1)

}