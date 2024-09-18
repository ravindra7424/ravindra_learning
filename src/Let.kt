class Let {
}

fun main1() {
    var name : String?="ravindra"
    name?.let { println("my name is ${name}") }
}

fun main() {
    var name : String?="ravindra"
    var a:String = name?.let { ("my name is $it") }?: ("null name")
   // println(a)
}