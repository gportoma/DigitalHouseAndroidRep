package br.com.digitalhouse.Aula142311

fun main() {
    var calculadora = Calculadora()

    println(calculadora.soma(8, 2))
    println(calculadora.subtracao(8, 2))
    println(calculadora.multiplicacao(8, 2))
    println(calculadora.divisao(8, 2))

    val soma: (Int,Int) -> Int = {num1,num2 -> num1 + num2}
    val subtracao: (Int,Int) -> Int = {num1,num2 -> num1 - num2}
    val multiplicacao: (Int,Int) -> Int = {num1,num2 -> num1 * num2}
    val divisao: (Int,Int) -> Int = {num1,num2 -> num1 / num2}
    println(soma(12,4))
    println(subtracao(12,4))
    println(multiplicacao(12,4))
    println(divisao(12,4))

}