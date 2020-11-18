package br.com.digitalhouse.Aula111611

fun main() {
    val foto = Foto()
    val documento = Documento()
    val contrato = Contrato()
    val impressora = Impressora()
    impressora.add(foto)
    impressora.add(documento)
    impressora.add(contrato)
    impressora.mostrarItens()
}




