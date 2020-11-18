package br.com.digitalhouse.Aula060411

fun main() {
    val cliente = Cliente("Gui","Porto")
    val conta = Conta(1,200.0,cliente)

    conta.deposito(10.0)
    conta.saque(210.0)
}