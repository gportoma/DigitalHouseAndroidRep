package br.com.digitalhouse.Aula101311

class IngressoNormal(valor: Double) : Ingresso(valor) {
    override fun imprimirValor() {
        println("Ingresso Normal $valor")
    }
}