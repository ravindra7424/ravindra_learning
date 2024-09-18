 val sum1 = { a: Int, b: Int -> a + b }
 val sum2:(Int,Int)-> Int  = { a , b -> a + b}
 val joke: String.(Int)->String = {this + it }
    fun main(args: Array<String>) {
        val result1 = sum1(2,3)
        val result2 = sum2(3,4)
        println("The sum of two numbers is: $result1")
        println("The sum of two numbers is: $result2")
        println(sum1(5,7))
        println("Hero".joke(10))
    }
