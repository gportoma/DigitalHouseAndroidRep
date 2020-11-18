package br.com.digitalhouse.Aula111611

class Contrato: Imprimivel {
    override var nome = "contrato"
    override var tipoDocumento = "muito legal"

    fun imprimir() {
        println("Eu sou um $nome $tipoDocumento")
    }
}