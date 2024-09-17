fun checkSpeed(speed: Int, limit: Int = 60 ) {

    val N = speed - limit

    if (speed > limit){

        println("Vous dépasser la limite de $N kilomètre par heure ")

    }
    else{
        println("Dans la limite")

    }
}

fun main() {
    checkSpeed(100, 60)
    checkSpeed(40, 90)
    checkSpeed(61)
    checkSpeed(60)
}