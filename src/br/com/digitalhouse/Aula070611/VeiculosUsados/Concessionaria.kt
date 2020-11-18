package br.com.digitalhouse.Aula070611.VeiculosUsados

class Concessionaria(val nome: String) {
    val vendas = arrayListOf<Venda>()

    fun registraVenda(carro: Carro, comprador: Comprador, valor: Double) { vendas.add(Venda(valor, carro, comprador))}
}