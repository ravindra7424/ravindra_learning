fun main(args: Array<String>) {
    val a = 5
    val b = 6

    val myString = """
    ${if (a > b) a else b}
"""
    println("Larger number is: ${myString}")
}