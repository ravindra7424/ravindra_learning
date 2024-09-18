class When_expression {
}

fun main() {
    var light : String="RED"
    var action = when(light){
        "RED"->"STOP"
        "YELLOW"->"READY TO MOVE"
        "GREEN"->"STOP"
        else->"signal lost"
    }
    println(action)
}