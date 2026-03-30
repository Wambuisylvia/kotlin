fun main(){
    val myObject=Car()
    myObject.move()
    myObject.hoot()

    val myValue=Cat()
    val myAnimal=Dogg() 
    myValue.meow()
    myValue.eat()
    myAnimal.bark()
  
    
    
}

open class Vehicle{
    fun move(){
        println("The vehicle can move")
    }      
}

class Car:Vehicle(){
    fun hoot(){
        println("Car can hoot")
    }

}

open class Animall{
    fun eat(){
        println("The animal can eat")
    }
    
}

class Cat:Animall(){
    fun meow(){
        println("The cat can Meow")
    }
    

}

class Dogg: Animall(){
    fun bark(){
        println("The dog can bark")
    }

}