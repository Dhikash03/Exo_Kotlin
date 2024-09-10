fun main() {

    var Harry_potter = readln()

    val maison = when(Harry_potter) {

        "gryffindor" -> "Bravery"
        "hufflepuff" -> "loyalty"
        "slytherin" -> "cunning"
        "ravenclaw" -> "intellect"

        else -> "not a valid house"
    }

    println(maison)

}
