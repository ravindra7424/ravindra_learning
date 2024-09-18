class Operator_overloading {
}

fun main() {
    var a:Int=10
     a+(1)
    println("ok")
    operator fun Int.plus (b:Int)
    {
        println(a+b)
        println("hi")
    }

}