import java.util.*

/*

    Convertir una cadena a mayúsculas, minúsculas o capitalizada en función de la elección delusuario.

 */
fun cadenaMayusculas(cadena: String): String{
    return cadena.toUpperCase()
}

fun cadenaMinuscula(cadena: String): String{
    return cadena.toLowerCase()
}

fun capitalizarCadena(cadena: String): String{
    return cadena.capitalize()
}
fun convertirCadenas(fn: (String) -> String): String{

    var scanner = Scanner(System.`in`)
    println("Introduce la cadena a modificar ")
    var cadena = scanner.nextLine()
         return fn(cadena)

}

fun main(){

    var scanner = Scanner(System.`in`)
    println("introduce la eleccion Mayusculas -- 0, minusculas -- 1, capitalizada -- 2")
    var eleccion = scanner.nextInt()
    when(eleccion){
        0 -> println(convertirCadenas(::cadenaMayusculas))
        1 -> println(convertirCadenas(::cadenaMinuscula))
        2 -> println(convertirCadenas(::capitalizarCadena))
    }

}