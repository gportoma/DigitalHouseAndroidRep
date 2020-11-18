package br.com.digitalhouse.Aula080911

class ContaPoupanca(cliente: Cliente, saldo: Double, val taxaJuros: Double) : Conta(saldo, cliente) {

    fun recolherJuros(): Double {
        val juros = taxaJuros * saldo / 100
        saldo += juros
        return saldo
    }
}