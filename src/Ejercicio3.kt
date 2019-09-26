import java.util.*

/*
Crea un programa que calcule el factorial de un número. Haz una versión iterativa y otrarecursiva.

 */

fun iterativa(numero : Int): Int{

    var contador = numero
    var result : Int = 1
    while ( contador!=0) {
        result=result*contador;
        contador--;
    }
    return result
}

fun recursiva(numero : Int): Int{
    if(numero == 0){
        return 1;
    }
    else
        return numero * recursiva(numero-1);
}

fun main(){

    var scanner = Scanner(System.`in`)
    println("Introduzca el numero al que desea hacerle el factorial")
    var numero = scanner.nextInt()
    println("el factorial es " + iterativa(numero))
    println("El factorial es " + recursiva(numero))
}