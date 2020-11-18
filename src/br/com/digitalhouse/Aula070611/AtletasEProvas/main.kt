package br.com.digitalhouse.Aula070611.AtletasEProvas

fun main() {
    val atleta1 = Atleta("Guilherme", 3, 30)
    val atleta2 = Atleta("Lucas", 2, 20)
    val prova1 = Prova(1, 10)
    val prova2 = Prova(2, 20)
    val prova3 = Prova(3, 30)

    println("Prova1: ")
    println(prova1.podeRealizar(atleta1))
    println(prova1.podeRealizar(atleta2))

    println("\nProva2: ")
    println(prova2.podeRealizar(atleta1))
    println(prova2.podeRealizar(atleta2))

    println("\nProva3: ")
    println(prova3.podeRealizar(atleta1))
    println(prova3.podeRealizar(atleta2))
}