/**
 * Exercício 4: companion object
Crie uma classe Matematica que use um companion object para fornecer funções utilitárias que não dependem da instância da classe.
Requisitos:
Crie uma class chamada Matematica.
Dentro da classe, crie um companion object que contenha as seguintes funções:
somar(a: Int, b: Int): Int
subtrair(a: Int, b: Int): Int
multiplicar(a: Int, b: Int): Int
As funções devem ser chamadas diretamente na classe Matematica, sem a necessidade de instanciá-la.
*/

class Matematica {
  companion object {
      fun somar(a: Int, b: Int): Int {
          return a + b
      }
      
      fun subtrair(a: Int, b: Int): Int {
          return a - b
      }
      
      fun multiplicar(a: Int, b: Int): Int {
          return a * b
      }
  }
}

fun main() {
  println("Soma: ${Matematica.somar(3, 5)}")
  println("Subtração: ${Matematica.subtrair(9, 5)}")
  println("Multiplicação: ${Matematica.multiplicar(2, 4)}")
}