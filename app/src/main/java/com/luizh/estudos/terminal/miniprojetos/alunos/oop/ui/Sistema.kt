val menu = arrayOf(
    "1 - Listar alunos e notas",
    "2 - Mostrar média da turma",
    "3 - Mostrar situação de um aluno",
    "4 - Atualizar nota de um aluno",
    "5 - Mostrar quantidade de aprovados, recuperação e reprovados",
    "6 - Incluir novo Aluno e sua Nota",
    "7 - Remover Aluno",
    "0 - Sair"
)

fun sistemaDeAlunos() {

    println("===== SISTEMA DE ALUNOS =====")

    val aluno = Aluno() //instanciando class Aluno

    do {
        for (exibir in menu) {
            println(exibir)
        }
        println("Informe o número da opção desejada: ")
        val infoUser = readln()
        val option = infoUser.toIntOrNull()

        if (option == null) {
            println("Digite apenas o número correspondente ao menu!")
            println("----------------------------------------------")
        }
        when (option) {
            1 -> aluno.alunosNotas()
            2 -> aluno.mediaTurma()
            3 -> aluno.situacaoAluno()
            4 -> aluno.atualizarNota()
            5 -> aluno.compilaStatusGeral()
            6 -> aluno.adicionarAluno()
            7 -> aluno.removerAluno()
            0 -> println("Sistema Encerrado!")
        }
    } while (option != 0)
}



