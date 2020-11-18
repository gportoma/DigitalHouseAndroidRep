package br.com.digitalhouse.Aula070611.JogadoresETreinamento

class JogadorDeFutebol(
    val nome: String,
    var energia: Int,
    var alegria: Int,
    var experiencia: Int,
    var gols: Int = 0
) {

    fun fazerGol() {
        gols += 1
        if (energia >= 5) {
            energia -= 5
            alegria += 10
            println("GOOOOL!!!!")
        } else {
            println("Jogador Cansado para o GOL")
        }

    }

    fun correr() {
        if (energia >= 10) {
            energia -= 10
            println("Cansei")
        } else println("Jogador Cansado")
    }

}