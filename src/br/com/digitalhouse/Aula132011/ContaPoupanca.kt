package br.com.digitalhouse.Aula132011

class ContaPoupanca(numeroConta: Int, saldo: Double, var limite: Double) : ContaBancaria(numeroConta, saldo),
    Imprimivel {

    override fun sacar(quantia: Double): Double {

        if (quantia <= saldo) {
            saldo -= quantia
            println("Saque Normal")
        } else if (quantia > saldo && quantia <= limite) {
            limite -= quantia
            saldo -= quantia
            println("Saque com Limite")
        } else {
            println("Saldo insuficiente")
        }

        return saldo
    }

    override fun mostrarDados() {
        println("Conta: $numeroConta\nSaldo: $saldo\n")
    }

}