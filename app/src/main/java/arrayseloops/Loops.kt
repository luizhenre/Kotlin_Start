package arrayseloops


fun main() {
    //arrays
    val nomes = arrayOf("Luiz","Henrique", "Maria" )
    val motor = doubleArrayOf(1.0,2.0,1.6)
    val posicoes = charArrayOf('A','B','C','D','E')

    println("Piloto: " + nomes[0] + "\nMotor do Carro: " + motor[1] + "\nPosição de inicio: " + posicoes[0] )

    //loops while
    var numero = 1
    while ( numero<=5 ){
        println("Numero $numero executado com While")
        numero++
    }
    //loops for
    for (contador in 1..30 step 2){
        if (contador in 7..9) continue
        if (contador==15) break
        println("$contador executado com For")
    }

    for ((indice,posicao) in posicoes.withIndex()){
        println("Posição ${indice} Letra $posicao")
    }

}





