/**
 * Exercício 1: Verificador de Idade para Venda de Bebidas Crie uma função em Kotlin que, dado o nome e a idade de uma pessoa, verifique se ela pode comprar bebidas alcoólicas. Considere que a idade mínima para compra é 18 anos. Requisitos: A função deve se chamar podeComprarBebida. Ela deve receber dois parâmetros: nome (do tipo String) e idade (do tipo Int). Dentro da função, use uma estrutura de decisão (if/else) para verificar se a idade é maior ou igual a 18. A função deve imprimir uma mensagem diferente para cada caso: Se a pessoa puder comprar, imprima: "Olá, [Nome]! Você tem [Idade] anos e pode comprar bebidas." Se a pessoa não puder, imprima: "Olá, [Nome]! Você tem [Idade] anos e não pode comprar bebidas."
 * */


fun podeComprarBebida(nome: String, idade: Int) {
    if (idade >= 18) {
        println("Olá, $nome! Você tem $idade anos e pode comprar bebidas.")
    } else {
        println("Olá, $nome! Você tem $idade anos e não pode comprar bebidas.")
    }
}

fun main() {
    podeComprarBebida("Maria", 20)
    podeComprarBebida("João", 16)
}