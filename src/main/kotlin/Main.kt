fun main(){

   val peeps= humans(mutableListOf(People("Grace",34,5.6,56.3),
    People("Jane",16,6.6,46.3),
    People("Joel",44,5.6,50.1)))

    addPeople(mutableListOf(People("Njeri",44,5.6,50.1),
        People("Maina",16,6.6,46.3)))

    println(averageMileage())


}

//Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age
//custom data

data class People(var name: String, var age:Int, var height: Double, var weight: Double)
fun humans(person: List<People>){
    println(person.sortedByDescending { p-> p.age })

}
//Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.

fun addPeople(x: MutableList<People>){

//println(x.addAll(People())

}

//Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.
data class Car(val registration: String, val mileage: Int)

fun averageMileage():Double{
    var carA = Car("KAL 232K", 800)
    var carB = Car("KDA 352K", 850)
    var carC = Car("KCA 333K", 800)

    val car = listOf(800,850,800)
    return (car.average())





}