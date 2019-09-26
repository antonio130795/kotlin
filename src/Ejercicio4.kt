import java.util.*
import kotlin.collections.ArrayList

/*
    Crea una función que separe una cadena que contiene una frase en palabras.
 */

/*
fun separarCadena(cadena: String): ArrayList<String>{
    val array =  ArrayList<String>()
    for (palabra in cadena.split(" ")) {
        array.add(palabra)
    }
    return array
}
*/
fun separarCadena(cadena: String){

}

fun main(){

    println("Introduce la cadena a separar")
    var scanner = Scanner(System.`in`)
    var cadena: String = scanner.nextLine()
    println(separarCadena(cadena))

}