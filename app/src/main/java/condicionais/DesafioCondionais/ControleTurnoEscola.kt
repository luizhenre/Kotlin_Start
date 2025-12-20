package condicionais.DesafioCondionais

/*
DESAFIO  Controle de Turno Escolar
Variáveis:
val turno: String   // "manha", "tarde", "noite"
val alunoAtivo: Boolean

Regras:

Aluno inativo → acesso negado

Turno:

manhã → acesso permitido

tarde → acesso permitido

noite → acesso permitido somente se aluno ativo

💡 Simples, mas atenção ao fluxo.*/


fun main() {
    val turno: String = "noite"  // "manha", "tarde", "noite"
    val alunoAtivo: Boolean = true

    if (alunoAtivo!=true){
        println("Acesso negado")
    }else{
         println("Acesso permitido")
    }
}