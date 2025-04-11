package es.iesraprog2425.pruebaes.calculadora.ui

import es.iesraprog2425.pruebaes.calculadora.app.Calculadora
import es.iesraprog2425.pruebaes.log.CalcLogger
import org.graalvm.compiler.bytecode.Bytecodes.operator
private val logger = CalcLogger()


val result = Calculadora.calculate(num1, operator, num2)
logger.logCalculation(num1, operator, num2, result)
println("Resultado: $result")

