package br.com.digitalhouse.Aula091111.ex2

import digitalhouse.com.br.ex2.Fatura


fun main() {
    val item2 = Item(1,"Mouse",8,2.0)
    val item3 = Item(1,"Teclado",5,3.0)
    val itens = arrayListOf(item2,item3)
    val fatura = Fatura()

    println(fatura.totalDaFatura(itens))

}