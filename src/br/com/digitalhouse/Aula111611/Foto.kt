package br.com.digitalhouse.Aula111611

class Foto:Imprimivel {
    override var nome = "selfie"
    override var tipoDocumento = "Jpg"

    fun imprimir() {
        println("Eu sou um $nome $tipoDocumento")
    }
}