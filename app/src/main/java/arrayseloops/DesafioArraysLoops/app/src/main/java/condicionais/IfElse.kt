package condicionais

fun main() {
    println("~~Bem vindo a loja de bebidas do dev!~~\nPara pagamentos por aproximação acima de R$ 150,00 será solicitado digito da senha!" )
    //considerando que /idade/ seria digitado por um usúario
    val idade = 18
    val totalCompra = 10.00

    if (idade >= 18){
        println("Maior de idade, você pode comprar bebidas. : )")
    }else{
        println("Menor de idade, venda proibida para menor, aguarde mais alguns anos")
    }

    //utilizando a expressão if para solicitar senha em compra por aproximação de acordo com valor
    val senha = if (totalCompra >= 150.00){
        "Digite sua senha:"
    }else{
        "Processando pagamento..."
    }
    println(senha)

}