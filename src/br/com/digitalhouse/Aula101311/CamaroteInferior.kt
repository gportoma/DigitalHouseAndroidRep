package br.com.digitalhouse.Aula101311

class CamaroteInferior(valor: Double) : Vip(valor) {
    val localizacao = "Inferior"
    fun imprimirLocalizacao() {
        println("Camarote: $localizacao")
    }

    fun valorIngressoCamInf() {
        println(valor)
    }
}