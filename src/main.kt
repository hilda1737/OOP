fun main(){
var Humanweight = Human("Hilda",25,40)

 Humanweight.eat(20)
    println(Humanweight.weight)

Humanweight.Speak("AkiraChix is a Dope School")

    var details = Human.User("Sakina","Issa","Noha@Issa","fwff3f")
    println(details.firstname)
    println(details.lastname)



}
class Human(var name:String, var age:Int, var weight:Int) {
    fun eat(foodWeight: Int) {
        var eat = 20
        weight += foodWeight
        println("i am eating $foodWeight kgs of food")

    }

    fun Speak(speech: String) {
        println(speech)


    }

    fun birthday(Year: Int): Int {
        age += Year
        return age
    }


    data class User(var firstname: String, var lastname: String, var email: String, var password: String)

}