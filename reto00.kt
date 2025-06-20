EJERCICIO:
 * - Crea un comentario en el código y coloca la URL del sitio web oficial del
 *   lenguaje de programación que has seleccionado.
 * - Representa las diferentes sintaxis que existen de crear comentarios
 *   en el lenguaje (en una línea, varias...).
 * - Crea una variable (y una constante si el lenguaje lo soporta).
 * - Crea variables representando todos los tipos de datos primitivos
 *   del lenguaje (cadenas de texto, enteros, booleanos...).
 * - Imprime por terminal el texto: "¡Hola, [y el nombre de tu lenguaje]!"



https://kotlinlang.org/

// Este es un comentario de una sola línea
val nombre = "Juan" // También se puede usar al final de una línea de código

/*
   Este es un comentario en bloque.
   Puede ocupar varias líneas.
   Se usa para explicaciones más extensas o para desactivar bloques de código.
*/

fun main() {
    // Cadenas de texto
    val texto: String = "Hola Kotlin"

    // Enteros
    val entero: Int = 42

    // Enteros más pequeños y más grandes
    val byte: Byte = 127
    val short: Short = 32000
    val long: Long = 123456789L

    // Decimales
    val float: Float = 3.14f
    val double: Double = 2.718281828

    // Booleanos
    val esVerdadero: Boolean = true     // how to put a boolean in kotlin : boolena/float/byte/short/String/Int //
    val esFalso: Boolean = false

    // Caracteres
    val caracter: Char = 'K'


   println("Texto: $texto")
    println("Entero: $entero")
    println("Byte: $byte, Short: $short, Long: $long")
    println("Float: $float, Double: $double")
    println("Booleanos: $esVerdadero y $esFalso")
    println("Caracter: $caracter")
    println("Hello__wolrd")
}


