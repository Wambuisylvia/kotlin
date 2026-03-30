fun main(){
    val myObject=Circle(21)
    myObject.display()
    myObject.area()

}

open class Shape(){
    fun display(){
        println("This is the shape")
    }
}

class Circle(val  radius:Int):Shape(){
    fun area(){
        val area=22/7*radius*radius
        println("The area is $area")
    }
}