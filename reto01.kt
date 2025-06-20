 * - Crea ejemplos utilizando todos los tipos de operadores de tu lenguaje:
 *   Aritméticos, lógicos, de comparación, asignación, identidad, pertenencia, bits...
 *   (Ten en cuenta que cada lenguaje puede poseer unos diferentes)
 * - Utilizando las operaciones con operadores que tú quieras, crea ejemplos
 *   que representen todos los tipos de estructuras de control que existan
 *   en tu lenguaje:
 *   Condicionales, iterativas, excepciones...
 * - Debes hacer print por consola del resultado de todos los ejemplos.
 *
 * DIFICULTAD EXTRA (opcional):
 * Crea un programa que imprima por consola todos los números comprendidos
 * entre 10 y 55 (incluidos), pares, y que no son ni el 16 ni múltiplos de 3.

// Use fun main () syntax is the best option to avoid problems when you compile // 
fun main () {        // All the code need to be inside of the main function, in the major of the cases fun main() //  
 val esVerdad : Int = 2  // Always the same structure when you define a value for an object //
 val noesVerdad :Byte = 4
 val nidea : String = "Hola que tal"
if (esVerdad == 0 && noesVerdad == 0.toByte()) {  // If you compare an Int and a Byte you need to put 0.tobyte() to procced correctly // 
  println("nada de esto es verdad")             // Same syntax like in java but, you dont need to put ";" in every line code //
} 

// Use of if in kotlin // 
val edad = 18  // define the value //
if (edad >= 18) {  // Use of the if inside the () //
    println("Eres mayor de edad")  // println is the form to print the result or the objet in kotlin // 
} else {                          
    println("Eres menor de edad")
}

// Use of when in kotlin //
val dia = 3   // Define the vaue of dia  //
when (dia) {  // when has the same use as "elif" in python //
    1 -> println("Lunes")
    2 -> println("Martes")
    else -> println("Otro día")
}

// Use of for in kotlin //
for (i in 1..5) {
    println("Contando: $i"){
}
  println(esVerdad)
  }

// Use of while in kotlin //
var i = 1
while (i <= 5) {
    println("Valor de i: $i")
    i++
}

// Use of do.. while in kotlin //
var j = 1
do {
    println("Número: $j")
    j++
} while (j <= 5)


// Specials of this language // 
try {                 // The use of try is used when your code has a probability to have an error  //
    val resultado = 10 / 0  //   This is an excepcion becuase you can not divide this number //
} catch (e: ArithmeticException) {  // In catch you define where your code could have an issue // 
    println("Error: División por cero")
} finally {                           // Finally is used when you want that this part will execute ever // 
    println("Este bloque siempre se ejecuta")
}
