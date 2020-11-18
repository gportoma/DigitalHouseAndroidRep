package br.com.digitalhouse.Aula070611.AtletasEProvas

import br.com.digitalhouse.Aula070611.AtletasEProvas.Atleta

class Prova(var dificuldade: Int, var energiaNecessaria: Int) {

    fun podeRealizar(atleta: Atleta): Boolean {
        val permitido = "${atleta.nome} possui nivel e energia para realizar a prova"
        val naoPermitido = "${atleta.nome} não possui nivel e energia para realizar a prova"

        if (atleta.nivel >= dificuldade && atleta.energia >= energiaNecessaria) {
            println(permitido)
            return true

        } else
            println(naoPermitido)
            return false

    }
}