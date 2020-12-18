package br.com.digitalhouse.Aula152511

data class Livro(
    val codigo: Int,
    val titulo: String,
    val autor: String,
    val anoLanc: String,
    val codISBN: String,
    var qntdEstoque: Int,
    var preco: Double
){

}