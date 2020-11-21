package br.com.digitalhouse.Aula121811.ex3

data class Aluno(val nome: String, val numeroDealuno: Int) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true

        other as Aluno

        if (numeroDealuno != other.numeroDealuno) return false

        return true
    }

}