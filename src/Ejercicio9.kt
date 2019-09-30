import kotlin.random.Random

/*
Inicializa un array con 2000 números enteros aleatorios entre el 1 y el 100.
Crea tus propiasfunciones para calcular el mínimo, máximo y la media del array.
Calcula la moda (el valorque más veces se repite en el array).
Calcula la frecuencia de aparición de cada número.
 */

fun minimo(numeros: IntArray): Int{
    var minimo: Int = 101
    for (valor in numeros){
        if(valor < minimo){
            minimo = valor
        }
    }
    return minimo
}

fun maximo(numeros: IntArray): Int{
    var maximo: Int = 0
    for (valor in numeros){
        if(valor > maximo){
            maximo = valor
        }
    }
    return maximo
}
fun media(numeros: IntArray): Double{
    var media: Double = 0.0
    for (valor in numeros){
        media += valor
    }
    return (media/2000)
}

fun moda(numeros: IntArray): Int{

    var moda = IntArray(101){ 0}
    
    for (valor in numeros){
        moda[valor] += 1
    }

    var maximo: Int = 0
    for (valor in moda){
        if(valor > maximo){
            maximo = valor
        }
    }

    var contador: Int = 0

    for (posicion in moda.indices){
        if(moda.get(posicion) == maximo)
            contador = posicion
    }

    return contador
}
fun frecuenciaDeAparicion(numeros: IntArray){
    var fAparicion = IntArray(101){ 0}

    for (valor in numeros){
        fAparicion[valor] += 1
    }
    for (posicion in fAparicion.indices){
        println("El numero " + posicion + " aparece " + fAparicion.get(posicion) + " veces")
    }
}
fun main(){
    val numeros = IntArray(2000){ Random.nextInt(1, 101)}
    println(minimo(numeros))
    println(maximo(numeros))
    println(media(numeros))
    println(moda(numeros))
    println(frecuenciaDeAparicion(numeros))
}

