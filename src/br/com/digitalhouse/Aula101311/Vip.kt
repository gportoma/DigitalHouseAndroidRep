package br.com.digitalhouse.Aula101311

class Vip(val valorAdicional: Double,valor:Double): Ingresso(valor) {
    override fun imprimirValor() {
        println("Ingresso custa ${valor + valorAdicional} ")
    }

}