package es.iesraprog2425.pruebaes.calculadora.app

class Calculadora {

    fun calculate(num1: Double, operator: Char, num2: Double): Double {
        return when (operator) {
            '+' -> num1 + num2
            '-' -> num1 - num2
            '*' -> num1 * num2
            '/' -> {
                if (num2 == 0.0) throw CalculatorException("No se puede dividir por cero")
                num1 / num2
            }
            else -> throw CalculatorException("Operador no válido")
        }
    }
}