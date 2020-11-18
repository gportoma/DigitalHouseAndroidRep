package br.com.digitalhouse.Aula091111.ex3

class Estoque(var nome: String, var qtdAtual: Int, var qtdMinima: Int) {

    fun mudarNome(nomeP: String) {
        nome = nomeP
        println("Novo nome: $nome")
    }

    fun mudarQtdMinima(qtdM: Int) {
        qtdMinima = qtdM
    }

    fun repor(qtd: Int) {
        if (qtd > 0) {
            qtdAtual += qtd
        }
    }

    fun darBaixa(qtd: Int) {
        if (qtd <= qtdAtual)
            qtdAtual -= qtd
    }

    fun mostra() {
        println("Produto: $nome \nQuantidade Minima: $qtdMinima \nQuantidade Atual: $qtdAtual")
    }

    fun precisaRepor():Boolean {
        return (qtdAtual <= qtdMinima)
    }
}