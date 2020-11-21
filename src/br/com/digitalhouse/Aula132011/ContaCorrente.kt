package br.com.digitalhouse.Aula132011

class ContaCorrente(numeroConta: Int, saldo: Double, val taxaOperacao: Double) : ContaBancaria(numeroConta, saldo),
    Imprimivel {

    fun descontoOperacao() {
        saldo -= taxaOperacao
    }

    override fun sacar(quantia: Double): Double {
        if (quantia <= saldo) {
            descontoOperacao()
            saldo -= quantia
        } else {
            println("Valor insuficiente")
        }
        return saldo
    }

    override fun depositar(quantia: Double): Double {
        descontoOperacao()
        return super.depositar(quantia)
    }

    override fun mostrarDados() {
        println("Conta: $numeroConta\nSaldo: $saldo\n")
    }

}