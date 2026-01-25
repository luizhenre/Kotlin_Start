package com.luizh.estudos.terminal.miniprojetos.alunos

var menu = arrayOf(
    "1 - Listar alunos e notas",
    "2 - Mostrar média da turma",
    "3 - Mostrar situação de um aluno",
    "4 - Atualizar nota de um aluno",
    "5 - Mostrar quantidade de aprovados, recuperação e reprovados",
    "0 - Sair"
)


fun sistemaDeAlunos() {
    println("===== SISTEMA DE ALUNOS =====")

    do {
        for (exibir in menu) {
            println(exibir)
        }
        println("Informe o número da opção desejada: ")
        var opcao = readln().toInt()
        when (opcao) {
            1 -> alunosNotas(alunos,notas)
            2 -> mediaTurma(notas)
            3 -> situacaoAluno(alunos,notas)
            4 -> atualizarNota(alunos,notas)
            5 -> compilaStatusGeral(notas)
            0 -> println("Sistema Encerrado!")
        }
    } while (opcao != 0)
}