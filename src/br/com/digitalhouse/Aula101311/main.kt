package br.com.digitalhouse.Aula101311

fun main() {
    print("Escolha 1 para Ingresso Normal e 2 para Ingresso Vip: ")
    val ingresso = readLine()
    if (ingresso == "1") {
        val ingressoNormal = IngressoNormal(30.0)
        ingressoNormal.imprimirValor()
    } else if (ingresso == "2") {
        print("Escolha 1 para camarote superior ou 2 para camarote inferior: ")
        val camarote = readLine()
        if (camarote == "1") {
            val camaroteSuperior = CamaroteSuperior(60.0, 40.0)
            camaroteSuperior.imprimirLocalizacao()
            camaroteSuperior.valorIngressoCamSup()
        } else {
            val camaroteInferior = CamaroteInferior(40.0)
            camaroteInferior.imprimirLocalizacao()
            camaroteInferior.valorIngressoCamInf()
        }
    }else{
        println("Numero incorreto")

    }
}

fun criarIngresso() {

}