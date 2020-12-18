package br.com.digitalhouse.Aula142311

class Calculadora() : Operacoes {

    override fun soma(num1: Int, num2: Int): Int = num1 + num2
    override fun subtracao(num1: Int, num2: Int): Int = num1 - num2
    override fun multiplicacao(num1: Int, num2: Int): Int = num1 * num2
    override fun divisao(num1: Int, num2: Int): Int = num1 / num2

}