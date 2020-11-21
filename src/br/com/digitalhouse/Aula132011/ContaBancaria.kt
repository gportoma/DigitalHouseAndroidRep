package br.com.digitalhouse.Aula132011

abstract class ContaBancaria(val numeroConta: Int, var saldo: Double) {

    abstract fun sacar(quantia: Double):Double

    open fun depositar(quantia: Double):Double{
        if (quantia > 0) {
            saldo += quantia
        } else {
            println("Valor Invalido")
        }
        return saldo
    }
}