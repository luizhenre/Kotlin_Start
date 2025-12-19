package condicionais

fun main() {
    println("#### Mês do Ano! ####")
    val mesAno = 13

    when(mesAno){// instrução simples, imprime a opção equivalente ao informado na val
        1 -> println("Janeiro")
        2 -> println("Fevereiro")
        3 -> println("Março")
        4 -> println("Abril")
        5 -> println("Maio")
        6 -> println("Junho")
        7 -> println("Julho")
        8 -> println("Agosto")
        9 -> println("Setembro")
        10 -> println("Outubro")
        11 -> println("Novembro")
        12 -> println("Dezembro")
        else -> println("O ano é composto por 12 meses apenas!")
    }

    println("#### Utilizando When para comparação de expressão ####")
    val prevTempo = "ensolarado"
    val guardaChuva = when (prevTempo){// compara a expressão da variavel com as opções para impressão
        "ensolarado" -> "Usar protetor solar"
        "chuvoso" -> "Levar guarda chuva"
        else -> "Previsão do tempo não identificada, verifique sua conexão!"
    }
    println(guardaChuva)

    println("#### Utilizando When com ranges ####")
    val idade = 19
    when(idade){// when utilizando ranges, compara o valor informado com o intervalo dos atributos
        in 0..2 -> println("Você é um bebê")
        in 2..12 -> println("Você é uma criança")
        in 12..18 -> println("Você é um adolescente")
        else -> println("Você já é adulto!")
    }

    println("#### Utilizando When com virgulas")

    val roupa = "blusa"
    when(roupa){// pode diversos tipos agrupados para execução do código
        "blusa","touca","luvas de lã" -> println("Roupa de frio!")
        "bermuda", "regata", "shorts" -> println("Roupa para calor")
        "oculos escuros", "boné", "sandália" -> println("Acessorio para calor!")
        else -> println("Utilizado para todas as estações!")
    }

}