//If as an expression
//For loop
//When expression
//When expression with predicates
fun bigger(a: Int, b: Int) = if (a > b) a else b
val list = listOf("A", "B", "C")
fun main(args: Array<String>) {
    println("Hello, World")
    for (element in list) {
        println(element)
    }
}

fun numberTypeName(x: Number) = when(x) {
    0 -> "Zero" // Equality check
    in 1..4 -> "Four or less" // Range check
    5, 6, 7 -> "Five to seven" // Multiple values
    is Byte -> "Byte" // Type check
    else -> "Some number"
}
fun signAsString(x: Int)= when {
    x < 0 -> "Negative"
    x == 0 -> "Zero"
    else -> "Positive"
}