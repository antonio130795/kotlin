import java.util.*

/*
Crea un programa que convierta una cantidad en euros que se pide al usuario a bitcoins.
Usala clase Scanner de java para leer de la entrada estándar.
 */
fun main() {
    println("Introduce la cantidad de euros ")
    val scanner = Scanner(System.`in`)
    var numero: Double = scanner.nextDouble()
    val bit: Double = 7661.50
    var resultado = numero * bit
    println("la cantidad de bitcoins es $resultado")

}