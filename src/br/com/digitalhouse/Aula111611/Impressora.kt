package br.com.digitalhouse.Aula111611

class Impressora {
    val listaImprimivel = mutableListOf<Imprimivel>()

    fun add(imprimivel: Imprimivel) {
        listaImprimivel.add(imprimivel)
    }

    fun mostrarItens() {
        for (imp in listaImprimivel) {
            if(imp is Foto){
                imp.imprimir()
            }
            if(imp is Documento){
                imp.imprimir()
            }
            if(imp is Contrato){
                imp.imprimir()
            }
        }
    }
}