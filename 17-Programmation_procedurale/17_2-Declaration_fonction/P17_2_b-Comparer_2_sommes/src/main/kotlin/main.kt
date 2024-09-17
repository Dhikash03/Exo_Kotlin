fun isGreater(Nombre1 : Int,Nombre2: Int,Nombre3: Int,Nombre4: Int) : Boolean {

    if (Nombre1 + Nombre2 > Nombre3 + Nombre4) {
        return true
    }

    else {
        return false
    }

}





fun main() {
    val number1 = readLine()!!.toInt()
    val number2 = readLine()!!.toInt()
    val number3 = readLine()!!.toInt()
    val number4 = readLine()!!.toInt()

    println(isGreater(number1, number2, number3, number4))
}
