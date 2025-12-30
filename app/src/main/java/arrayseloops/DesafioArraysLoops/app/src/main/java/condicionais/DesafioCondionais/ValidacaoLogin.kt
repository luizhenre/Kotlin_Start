package condicionais.DesafioCondionais

/*
DESAFIO — Validação de Login
Variáveis:
val usuario: String
val senha: String

Regras:

Usuário ou senha vazios → inválido

Usuário "admin" e senha "1234" → acesso total

Usuário "user" e senha "abcd" → acesso limitado

Qualquer outro caso → acesso negado*/


fun main() {
    val usuario: String = "user"
    val senha: String = "abcd"

    if (usuario == "" || senha == "") {
        println("Dados inválidos")
    } else if (usuario == "admin" && senha == "1234") {
        println("Acesso total")
    } else if (usuario == "user" && senha == "abcd") {
        println("Acesso limitado")
    } else {
        println("Acesso negado")
    }
}