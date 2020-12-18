package br.com.digitalhouse.Aula162711

fun main() {
//ex1()
    ex2()
}

fun ex1() {
    val loteriaDosSonhos = mapOf(0 to "Ovos", 1 to "Água", 2 to "Escopeta", 3 to "Cavalo", 4 to "Dentista", 5 to "Fogo")
    println(loteriaDosSonhos)
    println(loteriaDosSonhos.size)
    println("Eu gosto de ${loteriaDosSonhos[0]}")
}

fun ex2(){
    val apelidos = "oi"
    val apelido = mapOf<String,String>("Guilherme" to apelidos)

    println("Qual meu apelido ${apelido["Guilherme"]}")
}