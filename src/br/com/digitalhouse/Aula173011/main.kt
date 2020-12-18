package br.com.digitalhouse.Aula173011

fun main() {
    ex2()
}

//ex1
fun ex1() {
    try {
        val lista = listOf("pato", "cachorro", "gato")
        println(lista[3])
    } catch (ex: ArrayIndexOutOfBoundsException) {
        println("Tipo: ${ex.cause} Surgiu ${ex.message}")
    }


}

//ex2
fun ex2() {
    try {
        val listaString = mutableListOf<String?>(null)
        listaString.add("Pato")
        listaString.add("Cachorro")
        listaString.add("Gato")
        println(listaString[1])
    } catch (ex: Exception) {
        println("Tipo: ${ex.cause} Surgiu ${ex.message}")
    }


}
