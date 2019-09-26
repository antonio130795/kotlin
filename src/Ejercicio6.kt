import java.util.*

/*
    Mejora el programa anterior de forma que se pase como parámetro
    la función que realiza la comprobación sobre el número leído por teclado.
 */

//fun comprobarPar(numero: Double) = numero.toInt() % 2 == 0

fun comprobarRango(numero: Double): Boolean{

    if((numero >= 0.0) && (numero <= 10.0)){
        return true
    }
    return false
}

fun comprobacionDeRangos(fn: (Double)-> Boolean){

    var scanner = Scanner(System.`in`)
    var numero: Double = 0.0

    do {
        println("Introduce un numero entre 1 y 10 ")
        numero = scanner.nextDouble()
    }while (!fn(numero))

}



fun main(){

   comprobacionDeRangos(::comprobarRango)

}