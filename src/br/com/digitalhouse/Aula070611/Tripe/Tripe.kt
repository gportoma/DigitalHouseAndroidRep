package br.com.digitalhouse.Aula070611.Tripe

class Tripe() {
    var dobrado = false
    val alturaMinima = 1
    val alturaMaxima = 10
    var alturaAtual = 0

    fun definirAltura(novaAltura: Int):Int {
        alturaAtual = novaAltura
        return alturaAtual
    }

    fun dobrar(): Boolean {
        dobrado = true
        return true
    }

    fun desdobrar(): Boolean {
        dobrado = false
        return false
    }

    fun guardar() {
        dobrar()
        alturaAtual = alturaMinima
    }

    fun prontoParaGuardar() {
        if (dobrado == true && alturaAtual == alturaMinima) {
            println("Pronto Para Guardar")
        } else {
            println("Não está pronto para Guardar")
        }
    }

    fun usar() {
        desdobrar()
        alturaAtual = alturaMaxima
    }

    fun prontoParaUsar() {
        if (!dobrado && alturaAtual > alturaMaxima / 5) {
            println("Pronto para uso")
        } else {
            println("Não está pronto para uso")
        }
    }

}