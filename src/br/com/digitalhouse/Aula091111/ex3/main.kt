package br.com.digitalhouse.Aula091111.ex3

fun main() {
    val estoque = Estoque("Canetas", 2, 1)

    estoque.mostra()
    estoque.mudarQtdMinima(2)
    estoque.mostra()
    estoque.darBaixa(2)
    estoque.mostra()
    estoque.repor(3)
    estoque.mostra()
    println(estoque.precisaRepor())

}