fun sum(Nombre1:Int, Nombre2: Int, Nombre3: Int) : Int{
    return Nombre1 + Nombre2 + Nombre3
}// write your function here

fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()

    println(sum(a, b, c))
}

