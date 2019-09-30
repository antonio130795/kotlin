import java.util.*

/*
Crea un programa que pide al usuario una lista de 10 números enteros.
Posteriormenteordena la lista creando tu propio algoritmo de ordenación e imprime por pantalla la lista demenor a mayor.

 */

fun ordenar(numeros: IntArray): IntArray{

    var numeroGuardado = 0
    for(x in 0 until 10) {
        for (y in 0 until 10) {
            if (numeros[x] < numeros[y]) {
                numeroGuardado = numeros[y]
                numeros[y] = numeros[x]
                numeros[x] = numeroGuardado
            }
        }
    }
    return numeros
}

fun main(){

    var scanner = Scanner(System.`in`)
    println("Introduce 10 numeros a ordenar")
    var numeros = IntArray(10)
    for (indice in 0..9){
        numeros[indice] = scanner.nextInt()
    }

    ordenar(numeros)
    for (indice in 0..9){
        println(numeros[indice])
    }
}