package br.com.digitalhouse.Aula060411

class Conta(val numeroConta: Int, var saldo: Double, val titular: Cliente) {

    fun deposito(quantia: Double) {
        if (quantia > 0) {
            println("Saldo Anterior: $saldo")
            saldo += quantia
            println("Depósito de $quantia, Saldo Atual: $saldo")
        } else {
            println("Deposito Insuficiente")
        }
    }

    fun saque(quantia: Double) {
        if (quantia <= saldo){
            println("Saldo Anterior $saldo")
            saldo -= quantia
            println("Saque de $quantia, Saldo Atual: $saldo")
        }else{
            println("Saldo Insuficiente")
        }
    }
}