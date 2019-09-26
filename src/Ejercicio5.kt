import java.util.*

/*
    Implementa una función que lea un número por teclado y comprueba que dicho número estáentre 0 y 10 incluidos.
    Si se inserta otro número se vuelve a pedir el número.
 */
fun main(){

    var scanner = Scanner(System.`in`)
    var numero: Double = 0.0

    do {
        println("Introduce un numero entre 1 y 10 ")
        numero = scanner.nextDouble()
    }while ((numero <= 0.0) || (numero >= 10.0))

}