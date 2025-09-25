/**
 * Exercício 2: Calculadora de IMC Crie um programa que calcule o Índice de Massa Corporal (IMC). O programa deve receber o peso em quilogramas e a altura em metros e, em seguida, classificar o resultado. Requisitos: Crie uma função chamada calcularIMC que receba peso (do tipo Double) e altura (do tipo Double) e retorne o valor do IMC (também Double). A fórmula é: IMC = peso / (altura * altura). Crie uma segunda função chamada classificarIMC que receba o IMC calculado e imprima uma mensagem de acordo com a tabela abaixo: Menor que 18.5: "Abaixo do peso" Entre 18.5 e 24.9: "Peso normal" Entre 25.0 e 29.9: "Sobrepeso" 30.0 ou mais: "Obesidade" O programa principal deve chamar as duas funções em sequência.
 */

fun calcularIMC(peso: Double, altura: Double): Double {
  return peso / (altura * altura)
}

fun classificarIMC(imc: Double) {
  when {
      imc < 18.5 -> println("Abaixo do peso")
      imc in 18.5..24.9 -> println("Peso normal")
      imc in 25.0..29.9 -> println("Sobrepeso")
      else -> println("Obesidade")
  }
}

fun main() {
  val peso = 70.0 
  val altura = 1.75
  
  val imc = calcularIMC(peso, altura)
  println("Seu IMC é: %.2f".format(imc))
  classificarIMC(imc)
}

