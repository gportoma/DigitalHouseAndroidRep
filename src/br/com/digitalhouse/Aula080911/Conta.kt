package br.com.digitalhouse.Aula080911



abstract class Conta(var saldo: Double, val cliente: Cliente) {

    fun depositarDinheiro(valor: Double): Double {
        if (valor > 0) {
            saldo += valor
        } else {
            println("Saldo Insuficiente")
        }
        return saldo
    }

    open fun sacarDinheiro(valor: Double): Double {
        if (valor <= saldo) saldo -= valor else {
            println("Saldo Insuficiente")
        }

        return saldo
    }

    fun consultarSaldo(): Double {
        return saldo
    }
}