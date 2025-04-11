package es.iesraprog2425.pruebaes.log



import java.io.File
import java.text.SimpleDateFormat
import java.util.*

class CalcLogger(private val logDirectory: String = "logs") {
    init {
        File(logDirectory).mkdirs()
    }

    fun logCalculation(num1: Double, operator: Char, num2: Double, result: Double?) {
        val timestamp = SimpleDateFormat("yyyyMMdd_HHmmss").format(Date())
        val logFile = File("$logDirectory/calculation_$timestamp.log")

        val logEntry = """
            |[${Date()}]
            |Operación: $num1 $operator $num2
            |Resultado: ${result ?: "Error"}
            |--------------------------------
        """.trimMargin()

        logFile.writeText(logEntry)
    }
}