package br.com.digitalhouse.Aula111611

class Documento:Imprimivel {
    override var nome = "documento"
    override var tipoDocumento = "word"

    fun imprimir() {
        println("Eu sou um $nome $tipoDocumento")
    }
}