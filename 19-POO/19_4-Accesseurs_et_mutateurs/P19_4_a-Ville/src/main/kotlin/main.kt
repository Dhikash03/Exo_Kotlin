class City(val name: String) {
    var population: Int


    constructor(name: String, population : Int): this(name)

        init{

            if (population > 50_000_000){
                this.population = 50_000_000
            }
            else if (population < 0){
                this.population = 0
            }
        }
    }


fun main() {
    val goodCity = City("Good City")
    val badCity = City("Bad City")
    val noCity = City("no City")
    badCity.population = 65_000_000
    println(badCity.population)

    goodCity.population = 45_000_000
    println(goodCity.population)

    noCity.population = -5000
    println(noCity.population)
}