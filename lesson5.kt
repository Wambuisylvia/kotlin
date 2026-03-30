fun main (){

    val myObject=person()
    myObject.eat()
    myObject.walk()
    myObject.sleep()

}

class person{

    // attributes of peron objects

    var name="joe"
    var age=20

    // behaviours of the person object

    fun eat(){
        println("The person $name can eat")
    }

    fun walk(){
        println("The person $name can walk well because he is $age years old")
    }

    fun sleep(){
        println("The person $name can sleep")
    }
}
// OOP- object oriented programing
// oop is writting a code in an organised format of an object