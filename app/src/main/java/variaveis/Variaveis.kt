package variaveis

fun main() {
    //descobrindo que além de numeros, é possivel somar/concatenar palavras
    val mens1 = "Olá"
    val mens2 = " Visitante"
    println(mens1 + mens2)

    //declarando minhas primeiras variaveis imutaveis
    val num1 = 10
    val num2 = 10
    println("Aprendi que usamos val quando não temos intenção de alterar/sobrescrever o valor da \nvariavel, quando identificado a necessidade de alterar o valor de uma val, basta substituir sua propriedade para -> var!")

    // imprimindo resultados com uma mensagem
    println("Resultado do calculo quando somado $num1 + $num2: ${num1+num2} \nsubtraido: ${num1-num2} \nDividido: ${num1/num2} \nMultiplicado: ${num1*num2} ")



}