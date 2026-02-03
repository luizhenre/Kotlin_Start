# 🎓 Controle de Alunos — Versão Orientada a Objetos (OOP)

Este projeto é a evolução do mini sistema de controle de alunos desenvolvido inicialmente utilizando **programação procedural**.  
Após consolidar a base da linguagem Kotlin com variáveis, funções, loops e arrays, o mesmo sistema foi **totalmente refatorado aplicando os conceitos de Orientação a Objetos (OOP)**.

O objetivo deste projeto é demonstrar, na prática, a transição da lógica procedural para uma arquitetura orientada a objetos, organizando responsabilidades, encapsulando dados e tornando o código mais estruturado e reutilizável.

---

## 🚀 Funcionalidades do sistema

O sistema roda no terminal e permite:

- 📋 Listar alunos e suas respectivas notas
- 📊 Calcular a média geral da turma
- 🔎 Consultar a situação individual de um aluno (Aprovado | Recuperação | Reprovado)
- ✏️ Atualizar a nota de um aluno
- ➕ Adicionar um novo aluno com validações de nome e nota
- ➖ Remover um aluno da lista
- 🛡️ Validações de entrada para evitar falhas por erro do usuário

---

## 🧠 Conceitos de OOP aplicados

Durante a refatoração foram aplicados:

- Encapsulamento dos dados dentro da classe
- Responsabilidade da classe sobre os dados e comportamentos
- Separação de responsabilidades entre `Main`, `Sistema` e a classe de domínio
- Organização do código para evitar dependência de variáveis globais
- Programação defensiva para tratamento de entradas inválidas

---

## 🗂️ Estrutura do projeto

- Main.kt → inicia o sistema
- Sistema.kt → controle de fluxo e menu
- Aluno.kt → classe responsável pelos dados e regras da turma


---

## 🎯 Objetivo didático

Este projeto faz parte da minha jornada de aprendizado em Kotlin e Desenvolvimento Android, registrando a evolução do entendimento de lógica procedural para orientação a objetos através de mini projetos práticos.

A versão procedural deste mesmo sistema também está disponível neste repositório para fins de comparação e evolução.

---

## ▶️ Como executar

Basta rodar o arquivo `Main.kt` em um ambiente Kotlin/IntelliJ/Android Studio com suporte a execução no terminal.

---

## 📌 Autor

Luiz Henrique,

Desenvolvido como parte dos meus estudos em Análise e Desenvolvimento de Sistemas e prática contínua em Kotlin.
