package br.com.digitalhouse.Aula121811.ex2

data class Coca(val tamanho: Int, val preco: Double) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Coca

        if (tamanho != other.tamanho) return false

        return true
    }

}