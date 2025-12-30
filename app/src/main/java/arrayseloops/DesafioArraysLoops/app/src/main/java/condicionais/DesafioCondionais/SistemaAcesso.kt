package condicionais.DesafioCondionais

/*
 Cenário

Você está desenvolvendo um sistema de controle de acesso para uma empresa.

 Regras de acesso

Visitante sempre negado

Funcionário inativo → acesso negado

Funcionário ativo:

Cargo Diretor → acesso total

Cargo Gerente → acesso total

Cargo Analista:

Com autorização especial → acesso permitido

Sem autorização → acesso negado

Qualquer dado inválido → acesso negado

 Variáveis disponíveis
val tipoUsuario: String   // "visitante", "funcionario"
val ativo: Boolean
val cargo: String         // "diretor", "gerente", "analista"
val autorizacaoEspecial: Boolean

 Regras importantes

✔ Use if / else
✔ Pode usar when (opcional)
✔ Fluxo claro
✔ Sem variáveis inúteis
✔ Trate dados inválidos

 Resultado esperado (exemplos)
Acesso negado
Acesso permitido
Acesso total liberado*/

fun main() {
    val tipoUsuario: String = "" //"visitante" "funcionario"
    val ativo: Boolean = true
    val cargo: String = ""         // "diretor", "gerente", "analista"
    val autorizacaoEspecial: Boolean = true


    if (tipoUsuario=="visitante" || tipoUsuario=="funcionario" && ativo==false) {
        println("Acesso negado")
    } else {
        if (cargo=="analista" && autorizacaoEspecial==true) {
            println("Acesso permitido")
        } else if (cargo=="analista" && autorizacaoEspecial==false) {
            println("acesso negado")
        } else {
            when {
                cargo=="diretor" || cargo=="gerente" && ativo==true -> println("Acesso total")
                else -> println("Acesso negado")
            }
        }
    }
}