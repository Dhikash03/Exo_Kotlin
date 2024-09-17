import kotlin.math.hypot

fun perimeter(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double, x4: Double = x3, y4: Double = y3): Double {

    var a = hypot((x1 - x2),(y1 - y2))
    var b = hypot((x2 - x3) ,(y2 - y3))
    var c = hypot((x3 - x4),(y3 - x4))
    var d = hypot((x4 - x3) ,(y4 - y3))



    return  a + b + c + d
}

fun main() {
    println(perimeter(0.0, 0.0, 12.0, 0.0, 0.0, 5.0))
}