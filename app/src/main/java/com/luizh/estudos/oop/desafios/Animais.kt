package com.luizh.estudos.oop.desafios

/*
DESAFIO 4 — Herança + Polimorfismo (Animais)
Crie classe base:
Animal

Método:
emitirSom(): String

Crie subclasses:
Cachorro
Gato
Cada um deve sobrescrever emitirSom().

Na main:
Criar lista de Animal
Colocar cachorro e gato nela
Percorrer e imprimir o som (polimorfismo real)*/

abstract class Animal {
    abstract fun emitirSom(): String
}
class Cachorro : Animal() {
    override fun emitirSom(): String {
        return "Au AU"
    }
}
class Gato : Animal() {
    override fun emitirSom(): String {
        return "Miau Miau"
    }
}

fun main() {

    var listAnimal = listOf<Animal>(Cachorro(), Gato())

    for (percorrer in listAnimal){
        println(percorrer.emitirSom())
    }
}
