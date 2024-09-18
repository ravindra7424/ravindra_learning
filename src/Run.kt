class Run {
}
fun main2() {
    val original = "  Kotlin Programming  "
    val formatted = original.run {
        this.trim()
    }
    println("Formatted string: '$formatted'")
}
fun main() {
    val max = run {
        val a = 5
        val b = 10
        if (a > b) a else b  // Return the maximum
    }
    println("The maximum value is $max")  // Output: The maximum value is 10
}
