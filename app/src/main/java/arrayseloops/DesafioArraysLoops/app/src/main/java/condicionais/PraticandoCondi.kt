package condicionais

fun main() {
    val media = 8.0
    val email = "kotlin.aprovado@studio.com"
    val opcaoCertificado = 0

    when(media){
        in 0.0..5.0 -> println("Você foi reprovado!\nCompareça a diretoria para realizar nova matricula!")
        in 5.1..7.0 -> println("Você está de recuperação!\nConsulte sua diretora para saber o inicio da recuperação!")
        in 7.1..10.0 -> {
            println("Parabéns! Você foi aprovado!")

            when (opcaoCertificado) {
                1 -> println("Imprimir certificado e retirar direto na diretoria.")
                2 -> println("Enviar via correio para o endereço do cadastro do aluno.")
                3 -> println("Gerar QRcode para certificado digital.")
                4 -> println("Receber certificado via WhatsApp.")
                else -> println("Como não escolheu opção válida, o certificado de conclusão será enviado automaticamente para o e-mail: $email")
            }
        }
        else -> println("Média informada é inválida!") //Caso a média esteja fora do intervalo esperado
    }
}