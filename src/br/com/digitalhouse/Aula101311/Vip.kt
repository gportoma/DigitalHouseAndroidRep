package br.com.digitalhouse.Aula101311

open class Vip(valor: Double) : Ingresso(valor) {
    val valorAdicional = 30.0
    override fun imprimirValor() {
        println("Ingresso custa ${valor + valorAdicional} ")
    }

}