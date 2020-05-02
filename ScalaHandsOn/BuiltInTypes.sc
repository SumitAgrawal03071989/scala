// In Scala all of these data types are full-blown objects (not primitive data types).
val b: Byte = 1
val x: Int = 1
val l: Long = 1
val s: Short = 1
val d: Double = 2.0
val f: Float = 3.0.toFloat

// BigInt and BigDecimal
var b = BigInt(1234567890)
var c = BigDecimal(123456.789)

// String and Char
val name = "Bill"
println(s"Name: $name")
val newName = 'd'

println(s"Name: $newName")

// More features

println(s"Name: ${name} ${newName} ")

// For some people that’s easier to read, but an even more important benefit is that you can put expressions inside the braces, as shown in this REPL example:

//println(s"1+1 = ${1+1}")


//Multiline strings
val speech = """Four score and
               seven years ago
               our fathers ..."""


println(speech)





















