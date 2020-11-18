package digitalhouse.com.br.ex2

import br.com.digitalhouse.Aula091111.ex2.Item

class Fatura() {

    fun totalDaFatura(itens: List<Item>): Double {
        var totalCompra = 0.0
        for (item in itens) {
            if (item.precoUnit < 0 || item.qntdItem < 0){
                totalCompra += 0
            }else
            totalCompra += item.qntdItem * item.precoUnit

        }
        return totalCompra
    }
}


