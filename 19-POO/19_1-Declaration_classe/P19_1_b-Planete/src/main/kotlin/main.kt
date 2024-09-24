class Planet(){
    var star : String = "Unknown Star"
    var mass : Double = 1.0
    var numberOfSatellites : Int = 1
}// write your code here


fun main() {
    val kotlinPlanet = Planet()
    kotlinPlanet.star = "Java"
    kotlinPlanet.mass = 2.0
    kotlinPlanet.numberOfSatellites = 0
    println(kotlinPlanet.star)
    println(kotlinPlanet.mass)
    println(kotlinPlanet.numberOfSatellites)
}