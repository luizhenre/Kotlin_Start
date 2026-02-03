class Aluno() {

    //por questões de segurança, optei em private das variáveis
    private val alunos: MutableList<String> =
        mutableListOf("Ana", "Carlos", "Beatriz", "João", "Marcos")
    private val notas: MutableList<Double> = mutableListOf(7.5, 4.0, 8.0, 6.0, 3.5)
    fun alunosNotas() {

        for (position in alunos.indices) {
            //posição percorre ambos arrays
            println("Aluno $position: ${alunos[position]}")
            println("Nota: ${notas[position]}")
            println("-------------------")
        }
    }

    fun mediaTurma() {

        var soma = 0.0

        for (accumulator in notas) {
            soma += accumulator
        }
        println("A media dos Alunos é: ${soma / notas.size}")
        println("--------------------------")
    }

    fun situacaoAluno() {

        var status: String

        println("Digite o indice corresponte ao Aluno:")
        val userData = readln()
        var convertData = userData.toIntOrNull()

        //validação protege o sistema de possiveis erros de digitação
        while (convertData == null || convertData < 0 || convertData >= alunos.size) {
            println("O indice deve ser um número Inteiro e correspondente ao Aluno(a):")
            convertData = readln().toIntOrNull()
        }

        if (notas[convertData] < 5) {
            status = "Reprovado"
        } else if (notas[convertData] in 5.0..<7.0) {
            status = "Recuperação"
        } else status = "Aprovado"

        println("Aluno(a): ${alunos[convertData]} \n Nota: ${notas[convertData]}\n Situação: $status")
        println("--------------------------")
    }

    fun atualizarNota() {

        println("Informe o indice do Aluno:")
        val dataUser = readln()
        var convertData = dataUser.toIntOrNull()

        while (convertData == null || convertData < 0 || convertData >= alunos.size) {
            println("Indice Inválido, digite o indice correspondente ao Aluno:")
            convertData = readln().toIntOrNull()
        }

        println("Informe a nota atual:")
        val nota = readln()
        var notaAtual = nota.toDoubleOrNull()

        while (notaAtual == null || notaAtual !in 0.0..10.0) {
            println("A nota miníma é 0 e máxima é 10, digite a nota Correta:")
            notaAtual = readln().toDoubleOrNull()
        }

        notas[convertData] = notaAtual
        println("A nota do Aluno(a) ${alunos[convertData]}, foi atualizada para: $notaAtual")
        println("--------------------------")

    }

    fun compilaStatusGeral() {
        var aprovados = 0
        var recuperacao = 0
        var reprovados = 0

        for (identificador in notas) {
            if (identificador < 5) {
                reprovados++
            } else if (identificador in 5.0..<7.0) {
                recuperacao++
            } else aprovados++
        }
        println("Aprovados: $aprovados\nEm Recuperação: $recuperacao\nReprovados: $reprovados")
        println("--------------------------")
    }

    fun adicionarAluno() {
        var nameValidation: String
        while (true) {

            println("Informe o nome do novo Aluno(a):")
            //trim -> remove espaços
            nameValidation = readln().trim()
            //validação para garantir entrada correta
            val letterName = nameValidation.matches(Regex("^[A-Za-zÀ-ÖØ-öø-ÿ ]+\$"))
            val noSpace = nameValidation.replace(" ", "").length

            if (letterName && noSpace in 3..45) {
                alunos.add(nameValidation)
                break
            } else println("Nome deve possuir 3 letras ou mais.")
        }

        var validationNote: Double?
        while (true) {

            println("Informe a nota do $nameValidation: ")
            val doubleNote = readln()
            validationNote = doubleNote.toDoubleOrNull()
            //validação para garantir entrada correta
            if (validationNote != null) {
                if (validationNote !in 0.0..10.0) {
                    println("A nota deve ser de 0 a 10:")
                } else {
                    notas.add(validationNote)
                    break
                }
            }
        }
        println("O Estudante $nameValidation foi incluido com a nota $validationNote")
    }

    fun removerAluno() {

        println("Informe o indice do Aluno que deseja remover:")
        val input = readln().trim()
        val index = input.toIntOrNull()

        while (true) {
            // usei "!in" para considerar apenas indices válidos
            if (index !in 0..alunos.size || index == null) {
                println("O indice deve ser correspondente ao Aluno(a):")
                readln().trim()
            } else {
                alunos.removeAt(index)
                println("Remoção atualizada com sucesso, digite 1 para consultar a lista atualizada.")
                println("--------------------------")
                return
            }
        }
    }
}
