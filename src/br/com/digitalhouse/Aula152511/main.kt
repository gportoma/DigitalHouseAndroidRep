package br.com.digitalhouse.Aula152511

fun main() {
    val livro1 = Livro(1, "titulo1", "autor1", "2001", "00001", 1, 30.0)
    val livro2 = Livro(2, "titulo1", "autor1", "2001", "00001", 1, 30.0)
    val estoque = Estoque()

    estoque.cadastrarLivro(livro1)
    estoque.cadastrarLivro(livro2)
    println(estoque.consultarLivro(livro2))

}