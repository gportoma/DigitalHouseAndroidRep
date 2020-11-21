package br.com.digitalhouse.Aula132011

fun main() {
    val contaCGui = ContaCorrente(1,500.0,2.0)
    val contaPGui = ContaPoupanca(2,200.0,700.0)


    contaPGui.sacar(300.0)
    contaPGui.mostrarDados()
}