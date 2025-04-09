package es.iesraprog2425.pruebaes

import java.util.InputMismatchException
import java.util.Scanner


fun main() {
    val scanner = Scanner(System.`in`)
    var continuar = true

    while (continuar) {
        try {
            println("Introduce el primer número:")
            val numero1 = scanner.nextDouble()

            println("Introduce el operador (+, -, *, /):")
            val operador = scanner.next()[0]

            println("Introduce el segundo número:")
            val numero2 = scanner.nextDouble()

            val resultado = when (operador) {
                '+' -> numero1 + numero2
                '-' -> numero1 - numero2
                '*' -> numero1 * numero2
                '/' -> {
                    if (numero2 == 0.0) throw ArithmeticException("División por cero")
                    numero1 / numero2
                }
                else -> "Operador no válido"
            }

            println("Resultado: $resultado")
        } catch (_: InputMismatchException) {
            println("Error: Debes introducir un número válido")
            scanner.nextLine()
        } catch (e: ArithmeticException) {
            println("Error: ${e.message}")
        } catch (e: Exception) {
            println("Error inesperado: ${e.message}")
        }

        println("¿Desea realizar otro cálculo? (s/n)")
        continuar = scanner.next().equals("s", ignoreCase = true)
    }
}


/*
fun main() {
    val scanner = Scanner(System.`in`)

    println("Introduce el primer número:")
    val numero1 = scanner.nextDouble()
    println("Introduce el operador (+, -, *, /):")
    val operador = scanner.next()[0]
    println("Introduce el segundo número:")
    val numero2 = scanner.nextDouble()

    val resultado = when (operador) {
        '+' -> numero1 + numero2
        '-' -> numero1 - numero2
        '*' -> numero1 * numero2
        '/' -> numero1 / numero2
        else -> "Operador no válido"
    }

    println("Resultado: $resultado")
}
*/

/*
fun main() {
    Calculadora(Consola()).iniciar()
}
*/

/*
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    val numLineas = scanner.nextInt()
    scanner.nextLine() // Limpia el salto de línea pendiente

    var resultado = 1

    for (i in 1..numLineas) {
        var suma = 0
        while (scanner.hasNextInt()) {
            suma += scanner.nextInt()
        }
        resultado *= suma
        if (scanner.hasNextLine()) scanner.nextLine() // pasar a la siguiente línea
    }

    println(resultado)
}
*/