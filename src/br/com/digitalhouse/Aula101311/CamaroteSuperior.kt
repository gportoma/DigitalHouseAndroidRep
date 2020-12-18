package br.com.digitalhouse.Aula101311

class CamaroteSuperior(valor: Double, val valorAdicionalCamarote: Double) : Vip(valor) {
    val localizacao = "Superior"
    fun imprimirLocalizacao() {
        println("Camarote: $localizacao")
    }

    fun valorIngressoCamSup() {
        println(valor + valorAdicionalCamarote)
    }
}