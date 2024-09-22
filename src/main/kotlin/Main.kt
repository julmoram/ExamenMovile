package org.example

// Abstracción: Definir una clase abstracta "Animal" con un metodo abstracto "hacerSonido"
abstract class Animal {
    // Propiedad encapsulada (privada)
    private var nombre: String = "Animal"

    // Metodo público para acceder al nombre (Encapsulamiento)
    fun getNombre(): String {
        return nombre
    }

    // Metodo público para modificar el nombre (Encapsulamiento)
    fun setNombre(nombre: String) {
        this.nombre = nombre
    }

    // Metodo abstracto: debe ser implementado por las clases derivadas (Abstracción)
    abstract fun hacerSonido()

    // Metodo no abstracto que puede ser sobrescrito (Polimorfismo)
    open fun moverse() {
        println("$nombre se está moviendo.")
    }
}

// Herencia: La clase "Perro" hereda de la clase abstracta "Animal"
class Perro : Animal() {
    // Sobrescribir el metodo "hacerSonido" (Abstracción y Polimorfismo)
    override fun hacerSonido() {
        println("El perro ladra: ¡Guau guau!")
    }

    // Sobrescrir el metodo "moverse" (Polimorfismo)
    override fun moverse() {
        println("${getNombre()} está corriendo.")
    }
}

// Herencia: La clase "Gato" hereda de la clase abstracta "Animal"
class Gato : Animal() {
    // Sobrescrir el metodo  "hacerSonido" (Abstracción y Polimorfismo)
    override fun hacerSonido() {
        println("El gato maúlla: ¡Miau miau!")
    }

    // Sobrescribir el metodo "moverse" (Polimorfismo)
    override fun moverse() {
        println("${getNombre()} está caminando con sigilo.")
    }
}

// Función principal
fun main() {
    // Creamos un objeto de la clase Perro
    val perro = Perro()
    perro.setNombre("Firulais")
    perro.hacerSonido() // Polimorfismo
    perro.moverse()     // Polimorfismo

    // Creamos un objeto de la clase Gato
    val gato = Gato()
    gato.setNombre("Misu")
    gato.hacerSonido()  // Polimorfismo
    gato.moverse()      // Polimorfismo
}
