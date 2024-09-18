fun myFun(a: Int,b: Int, fn: (Int,Int) -> String): Unit {
    val result = fn(a,b)
    println(result)
}
fun main(args: Array<String>){
    val fn:(Int,Int)->String={a,b->"$a + $b =${(a+b)}"}
      myFun(a=10,b=5,fn)
}