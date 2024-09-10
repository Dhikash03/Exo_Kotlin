fun main() {

    val nombre = readln().toInt()
    //val M = 2..6

    if ( nombre % 2 == 0){
        println("Divided by 2 ")

    }
    if ( nombre % 3 == 0){
        println("Divided by 3")

    }
    if ( nombre % 5 == 0){
        println("Divided by 5 ")

    }

    if ( nombre % 6 == 0){
        println("Divided by 6 ")

    }

    /*val nombre = readln().toInt()

    for (M in 2..6){
        if (nombre % M == 0) {
            println("Divided By $M")
        }
    }*/
}