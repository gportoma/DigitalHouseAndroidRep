package br.com.digitalhouse.Aula053010.ExerciciosAula

fun main() {
//    ex1()
//    println(ex2(1,11))
//    println(ex3(11))
//    ex4()
//    ex5()
    ex6()
}

//Ex 1
fun ex1() {
    val umNumeroA = 100
    val umNumeroB = 50.0
    val umaCadeiaDeTexto = "Exercicio 01"

    println(umaCadeiaDeTexto)
    println("A soma de $umNumeroA e $umNumeroB é ${umNumeroA + umNumeroB}")
    println("A diferença de $umNumeroA e $umNumeroB é ${umNumeroA - umNumeroB}")

}

//Ex 2
fun ex2(num1: Int, num2: Int): Boolean = (num1 < num2)

//Ex 3
fun ex3(num1: Int): Boolean = (num1 % 2 != 0 && num1 > 10)

//Ex 4
fun ex4() {
    val arraylis = arrayListOf(10, 10, 20, 30)
    var inicio = 0
    for (array in arraylis) {
        inicio += array
    }
    print(inicio)
}

//Ex 5
fun ex5() {
    val arraylis = arrayListOf(11, 10, 10, 31)
    var inicio = 0
    for (array in arraylis) {
        if (array % 2 == 0)
            inicio += array
    }
    print(inicio)
}

//Ex 6
fun ex6(){
    val arraylis = arrayListOf(12, 10, 250, 31)
    for (array in arraylis) {
        if (array % 2 == 0)
            print(" $array")
    }
}
