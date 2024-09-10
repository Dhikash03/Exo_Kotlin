fun main() {

    val user = readln().toInt()

    val direction = when(user) {

        1 -> "move up"
        2 -> "move down"
        3 -> "move left"
        4 -> "right"
        0 -> "do not move"

        else -> "error!"

    }

    println(direction)

}
