/**
 * Exercício 5: Classes e Herança com Parâmetros
Crie uma hierarquia de classes para um sistema de folha de pagamento.
Requisitos:
Crie uma open class chamada Funcionario com as propriedades nome e salarioBase.
Crie uma class chamada Programador que herde de Funcionario. Ela deve ter uma propriedade adicional linguagem. O salarioBase deve ser 10% maior para programadores.
Crie uma class chamada Gerente que também herde de Funcionario. O salarioBase de um gerente deve ser 20% maior.
Implemente uma função calcularSalarioTotal() em cada classe que imprima o salário final.
Crie instâncias de Programador e Gerente e chame o método calcularSalarioTotal().
 */

open class Funcionario (
    val nome: String,
    open val salarioBase: Double
) {
     open fun calcularSalarioTotal() {
        println("Funcionário: $nome - Salário: R$ %.2f".format(salarioBase))
    }
}

class Programador (
	nome: String,
	salarioBase: Double,
    val linguagem: String
) : Funcionario(nome, salarioBase * 1.10) {
    override fun calcularSalarioTotal() {
        println("Programador: $nome (${linguagem}) - Salário: R$ %.2f".format(salarioBase))
    }
}

class Gerente (
    nome: String,
	salarioBase: Double
) : Funcionario(nome, salarioBase * 1.20) {
 override fun calcularSalarioTotal() {
        println("Gerente: $nome - Salário: R$ %.2f".format(salarioBase))
    }
}

fun main() {
    val programador = Programador("Lina", 10000.0, "Kotlin")
    val gerente = Gerente("Sara", 20000.0)
    
    programador.calcularSalarioTotal()
    gerente.calcularSalarioTotal()
}