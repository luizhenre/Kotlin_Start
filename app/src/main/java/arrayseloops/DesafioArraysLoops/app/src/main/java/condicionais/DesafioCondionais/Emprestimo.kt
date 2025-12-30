package condicionais.DesafioCondionais

/*val salario = 4200.0
val scoreCredito = 680
Regras
score < 0 ou salario ≤ 0 → "Dados inválidos"

score < 500 → "Crédito negado"

score 500–699:

salario ≥ 3000 → "Crédito aprovado com restrições"

salario < 3000 → "Crédito negado"

score ≥ 700 → "Crédito aprovado"

 Pode usar when sem argumento (when { }).*/

fun main() {
    val salario = 4200.0
    val scoreCredito = 680

    if (scoreCredito >= 700){
        println("Crédito aprovado")
    }else if (scoreCredito < 0 || salario <= 0){
        println("Dados invàlidos")
    }else if (scoreCredito < 500){
        println("Crédito negado")
    }else if (scoreCredito in 500..699 ){
        when{
            salario >= 3000.0 -> println("Crédito aprovado com restrições")
            salario < 3000 -> println("Crédito negado")
        }
    }
}

