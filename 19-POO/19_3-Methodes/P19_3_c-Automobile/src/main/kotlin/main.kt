class Car(val make: String, val year: Int) {

    var speed: Int = 0

    fun accelerate(){
        this.speed+= 5
    }

    fun decelerate(){

        this.speed = speed - 5

        if (this.speed < 0)
            speed = 0

    }


    // write the methods here
}

fun main() {
    val myCar = Car("Mustang", 1976)
    myCar.accelerate()
    println(myCar.speed)
    myCar.decelerate()
    myCar.decelerate()
    println(myCar.speed)
}