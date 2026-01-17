package mini_projetos_no_terminal.controleDeAlunos

fun alunosNotas(estudante: Array<String>, pontos: DoubleArray) {

    for (posicao in estudante.indices) {
        //posição percorre ambos arrays
        println("Aluno $posicao: ${estudante[posicao]}")
        println("Nota: ${pontos[posicao]}")
        println("-------------------")

    }
}

fun mediaTurma(pontos: DoubleArray) {
    var soma = 0.0
    for (acumulador in pontos) {
        soma += acumulador
    }
    println("A media dos Alunos é: ${soma / pontos.size}")
}

fun situacaoAluno(estudante: Array<String>, pontos: DoubleArray) {
    var status = ""

    println("Informe o indice do Aluno:")
    var indice = readln().toInt()

    if (indice < 0 || indice >= estudante.size) {
        println("Indice Inválido")
        return
    } else if (pontos[indice] < 5) {
        status = "Reprovado"
    } else if (pontos[indice] >= 5.0 && pontos[indice] < 7.0) {
        status = "Recuperação"
    } else status = "Aprovado"

    println("Aluno(a): ${estudante[indice]} \n Nota: ${pontos[indice]}\n Situação: $status")
}

fun atualizarNota(estudante: Array<String>, pontos: DoubleArray) {

    println("Informe o indice do Aluno:")
    var indice = readln().toInt()

    if (indice < 0 || indice >= estudante.size) {
        println("Indice Inválido")
        return
    }
    println("Informe a nota atual:")
    var notaAtual = readln().toDouble()

    if (notaAtual < 0 || notaAtual > 10) {
        println("A nota miníma é 0 e máxima é 10")
        return
    } else pontos[indice] = notaAtual

    println("A nota do Aluno(a): ${estudante[indice]} foi atualizada para: $notaAtual")
}

fun compilaStatusGeral(pontos: DoubleArray) {
    var aprovados = 0
    var recuperacao = 0
    var reprovados = 0

    for (identificador in pontos) {
        if (identificador < 5) {
            reprovados++
        } else if (identificador < 5.0 && identificador < 7.0) {
            recuperacao++
        } else aprovados++
    }
    println("Aprovados: $aprovados\nEm Recuperação: $recuperacao\nReprovados: $reprovados")
}
