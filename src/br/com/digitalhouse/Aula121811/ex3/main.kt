package br.com.digitalhouse.Aula121811.ex3

fun main() {
    val aluno1 = Aluno("Guilherme", 1)
    val aluno2 = Aluno("Pedro", 2)
    val aluno3 = Aluno("Joao", 3)
    val aluno4 = Aluno("Fernando", 4)
    val aluno5 = Aluno("Fernando", 4)

    var listaAlunos = listOf<Aluno>(aluno1, aluno2, aluno3, aluno4)

    println(listaAlunos.contains(aluno5.numeroDealuno))


}