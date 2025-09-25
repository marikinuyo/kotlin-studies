interface Barulhento {
  fun fazerSom()
}

abstract class Animal(val nome: String) {
  abstract fun comer()
}

class Cachorro(nome: String, val raca: String) : Animal(nome), Barulhento {
  override  fun comer() {
      println("$nome da raça $raca está comendo ração")
  }

  override fun fazerSom() {
      println("$nome da raca $raca está latindo")
  }
}

fun main() {
  val cachorro1 = Cachorro("Paçoca", "Labrador")
  val cachorro2 = Cachorro("Tofu", "Poodle")
  
  cachorro1.comer()
  cachorro1.fazerSom()
  
  cachorro2.comer()
  cachorro2.fazerSom()
}