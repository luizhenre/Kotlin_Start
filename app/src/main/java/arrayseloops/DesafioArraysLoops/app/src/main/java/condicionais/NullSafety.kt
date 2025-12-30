package condicionais

//?. -> safe call operator
//?: -> elvis operator
//!! -> operador de asserção não nula (usar somente em último caso), quando utilizado o mesmo descarta possibilidade do retorno ser null

fun main() {
    println("#### Exemplo de como inserir um valor padrão para retornos null ####")
    var nome: String? = "Luiz" //ao adicionar ? ao tipo, sinalizamos que pode receber a String ou nulo
    var tamanho: Int? = nome?.length ?: 0//caso nome seja nulo, não faça nada apenas mostre o valor padrão 0 (zero) sinalizado com elvis -> ?:
    println(tamanho)

    println("#### Exemplo de impressão com mensagem quando valor é null ####")
    val user: String? = null
    user?.let {//aqui só é executado quando o retorno não é nulo, quando o retorno é nulo .let não é executada
        println("Olá $user")
    } ?: println("usuario não cadastrado!")//quando nulo o operador elvis é chamado excutando println
}