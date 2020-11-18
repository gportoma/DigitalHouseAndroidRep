package br.com.digitalhouse.Aula070611.JogadoresETreinamento

class SessaodeTreinamento() {

    fun treinarA(jogadorTreino: JogadorDeFutebol) {
        var expIni = jogadorTreino.experiencia
        var eneIni = jogadorTreino.energia
        var aleIni = jogadorTreino.alegria
        jogadorTreino.correr()
        jogadorTreino.fazerGol()
        jogadorTreino.correr()
        jogadorTreino.experiencia += 1

        println("Experiencia Inicial: $expIni \nExperiencia Final ${jogadorTreino.experiencia}\n" +
                "Energia Inicial: $eneIni \nEnergia Final ${jogadorTreino.energia}\n" +
                "Alegria Inicial: $aleIni \nAlegria Final: ${jogadorTreino.alegria}\n")

    }
}