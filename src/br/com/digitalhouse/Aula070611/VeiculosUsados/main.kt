package br.com.digitalhouse.Aula070611.VeiculosUsados


fun main() {
    val concessionaria = Concessionaria("O melhor carro!")
    val carro = Carro("Fiat", "Uno", "2011", "Preto", 90000.0)
    val comprador = Comprador("Joao", "Silva", "5199867574")

    concessionaria.registraVenda(carro, comprador, 16500.0)

    for (venda in concessionaria.vendas) {
        println("Carro: ${venda.carroVendido.marca} ${venda.carroVendido.modelo}")
        println("Comprador: ${venda.comprador.nome} ${venda.comprador.sobrenome}")
        println("Valor: ${venda.valor}")
    }
}