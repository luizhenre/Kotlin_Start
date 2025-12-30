package condicionais

fun main() {
    println("##### Exemplificando estrutura && ####")
    //utilizando condicional && = AND
    val carne = false
    val temCarvao = false

    if (carne && temCarvao){//ambas variaveis precisam ser verdadeira para prosseguir
        println("Vamos começar assar a carne!")//ambas val verdadeiras
    }else{
        println("Não tem churrasco raiz sem carne ou carvão! :(")//uma ou ambas val false
    }

    //exemplo com condicional || = OR
    println("#### Exemplificando estrutura || ####")
    val idade = 17
    val comPai = false

    if (idade >= 18 || comPai){// basta apenas que 1 das val seja verdadeira para que prossiga
        println("Pode entrar no Show!")
    }else{
        println("Entrada não permitida para menor de idade sem o responsável!")
    }

    //exemplo com condicional ! = NOT
    println("#### Exemplificando estrutura ! ####")
    val like = true

    if (like != true) {// adicionar a condicional ! faz com que a saida seja invertida
        println("Curta o meu perfil!!")
    } else {
        println("Obrigado por curtir o meu perfil!")
    }

}