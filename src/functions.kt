fun main(args: Array<String>) {
    run()
    run(1)
    run(5,'c')
    run(letter = 'b')
    println(add(10,5))
}
fun run(num:Int= 5, letter: Char ='x',){
    println("parameter in function definition $num and $letter")
}
fun add(a:Int,b:Int)= a+b