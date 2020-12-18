package br.com.digitalhouse.Aula152511

class Estoque {

    var listaLivros = mutableListOf<Livro>()


    fun cadastrarLivro(livro: Livro) {
        listaLivros.add(livro)
    }

    fun consultarLivro(livro: Livro): Livro {
        for (livro in listaLivros) {
            if (livro.equals(listaLivros.contains(livro.codigo))){
                println(livro.toString())
            }else{
                println("Livro nao encontrado")
            }
        }
        return livro
    }

    fun efetuarVenda() {

    }
}