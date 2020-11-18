package digitalhouse.com.br

import br.com.digitalhouse.Aula080911.Cheque
import br.com.digitalhouse.Aula080911.Cliente
import br.com.digitalhouse.Aula080911.ContaCorrente
import br.com.digitalhouse.Aula080911.ContaPoupanca

fun main() {
    val clienteGuilherme = Cliente(1, "Porto", 552628153, 456741528)
    val clienteLucas = Cliente(2, "Sousa", 33555888, 999888777)
    val contaC = ContaCorrente(clienteGuilherme, 200.0, 600.0)
    val contaP = ContaPoupanca(clienteLucas, 300.0, 0.5)
    val cheque = Cheque(300.0, "Bradesco", "Dia 15")

    println(contaC.sacarDinheiro(300.0))
    println(contaC.depositarCheque(cheque))


}