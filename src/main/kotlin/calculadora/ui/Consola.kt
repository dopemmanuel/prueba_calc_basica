package es.iesraprog2425.pruebaes.calculadora.ui

import es.iesraprog2425.pruebaes.calculadora.app.Calculadora
import es.iesraprog2425.pruebaes.calculadora.app.CalculatorException
import java.util.*

class Consola {
    private val calculator = Calculadora()
    private val scanner = Scanner(System.`in`)

    fun start() {
        var continueCalculating = true

        while (continueCalculating) {
            try {
                println("Calculadora Básica")
                println("------------------")

                print("Ingrese primer número: ")
                val num1 = scanner.nextDouble()

                print("Ingrese operador (+, -, *, /): ")
                val operator = scanner.next()[0]

                print("Ingrese segundo número: ")
                val num2 = scanner.nextDouble()

                val result = calculator.calculate(num1, operator, num2)
                println("Resultado: $result")
            } catch (e: InputMismatchException) {
                println("Error: Entrada no válida. Debe ingresar números.")
                scanner.nextLine() // Limpiar buffer
            } catch (e: CalculatorException) {
                println("Error: ${e.message}")
            }

            print("¿Desea realizar otro cálculo? (s/n): ")
            continueCalculating = scanner.next().equals("s", ignoreCase = true)
        }
    }
}

