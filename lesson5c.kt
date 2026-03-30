fun main(){

    val myObject=Dog()
    myObject.eat()
    myObject.bark()

}
// inheritance-subclass inheriting fro superclass
open class Animal{
    fun eat(){
        println("The animal can eat")
    }
}

class Dog:Animal(){
    fun bark(){
        println("The dog can bark")
    }
}