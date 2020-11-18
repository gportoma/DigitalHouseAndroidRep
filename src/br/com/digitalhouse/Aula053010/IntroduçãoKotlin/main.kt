package br.com.digitalhouse.Aula053010.IntroduçãoKotlin

fun main() {

    ex1(8, 5, 6)
    println(ex2("Gui", "Gui"))
    println(ex3(6))
    println(ex4())
    println(ex5(9, 2, 3, 4))
    println(ex6())

}

//Ex 1 Escrever o código que deve analisar três números inteiros e retornar o maior deles.
fun ex1(num1: Int, num2: Int, num3: Int) {
    val numMaior = maxOf(num1, num2, num3)
    println("Dentre os Três números $num1 - $num2 - $num3, o maior é $numMaior")
}

//Ex 2 Escrever o código que deve analisar duas cadeias de texto e, caso sejam diferentes, retornar true, ou, caso sejam iguais, retornar false.
fun ex2(txt1: String, txt2: String): Boolean = (txt1 != txt2)


//Ex 3 Escrever o código que deve analisar um número inteiro e, caso ele seja par, retornar true, caso contrário, retorna false.
fun ex3(num1: Int): Boolean = (num1 % 2 == 0)

//Ex 4 Escrever um programa que imprima na tela os primeiros 100 números inteiros positivos ímpares.
fun ex4() {
    for (num in 1..100) {
        if (num % 2 != 0) {
            print(" $num")
        }
    }
}

//Ex 5 Escrever um código que deve analisar quatro números inteiros e, caso numA seja maior que numC e numD ou caso numB seja maior que numC e numD, retornar true, caso contrário, retornar false
fun ex5(numA: Int, numB: Int, numC: Int, numD: Int): Boolean =
    (numA > numC && numA > numD || numB > numC && numB > numD)

//Ex 6 Escrever um programa que exiba os primeiros 100 números positivos.
fun ex6() {
    for (num in 1..100) {
        if (num % 2 == 0) {
            print(" $num")
        }
    }
}