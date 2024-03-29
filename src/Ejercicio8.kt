import kotlin.random.Random

/*
    Tenemos que repartir 100 regalos a un auditorio de 1000 personas.
    Cada persona tiene unticket con un número del 1 al 1000.
    Crea un programa para repartir los regalos al azar
    deforma que no se pueda regalar a una misma persona más de un premio.
 */

fun main(){
    var numeroRegalos: Int = 100
    var numeroPersonas: Int = 1000
    var numerosPremiados =  IntArray(numeroRegalos){-1}

    for (regalo in 0..numeroRegalos-1){
        var num = 0
        do {
            num = Random.nextInt(1, numeroPersonas)
        }while(num in numerosPremiados)
        numerosPremiados[regalo] = num
        println(numerosPremiados[regalo])
    }

}