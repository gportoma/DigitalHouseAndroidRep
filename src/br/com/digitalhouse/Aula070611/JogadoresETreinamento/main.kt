package br.com.digitalhouse.Aula070611.JogadoresETreinamento


fun main() {
    val jogador1 = JogadorDeFutebol("Guilherme", 15, 50, 10)
    val jogador2 = JogadorDeFutebol("Lucas", 50, 80, 30)
    val treino = SessaodeTreinamento()

    println("Jogador 1: ")
    treino.treinarA(jogador1)
    println("Jogador 2: ")
    treino.treinarA(jogador2)

}