package br.com.digitalhouse.Aula080911

class ContaCorrente(cliente: Cliente, saldo: Double, var limiteChequeEspecial: Double) : Conta(saldo, cliente) {

    fun depositarCheque(cheque: Cheque): Double = depositarDinheiro(cheque.valor)

    override fun sacarDinheiro(valor: Double): Double {
        if (valor > saldo && valor <= limiteChequeEspecial) {
            saldo -= valor
        } else {
            return super.sacarDinheiro(valor)
        }
        return saldo
    }

}