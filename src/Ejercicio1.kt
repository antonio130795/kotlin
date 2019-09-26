fun main() {
    /*
    Implementa un programa que imprima en consola los  primeros  100 números  primos.
    Recuerda que un número primo es aquel que sólo es divisible por 1 y él mismo.

     */

    var numero: Int = 2
    var contador: Int = 0
    var primo = true

    fun comprobarPrimo(numero: Int): Boolean {
        for (i in 2..numero - 1) {
            // print(i)
            if (numero % i == 0) {
                return false

            }
        }

        return true
    }

    while (contador < 100) {
        if (comprobarPrimo(numero)) {
            println("$numero es primo")
            contador++
            numero++
        } else {
            //numero++
            //println("$numero no es primo"
            numero++
        }
    }
}