fun isVowel(a :Char) : Boolean{
    var voyelle = listOf('a','e','i','o','u','y')

    if (a in voyelle && a != 'y'){

        return true
    }
    else {
        return false
    }

    }
// write your function here

fun main() {
    val letter = readLine()!!.first()

    println(isVowel(letter))
}
