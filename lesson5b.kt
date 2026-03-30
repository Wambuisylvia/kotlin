fun main(){
    val myObject=Square()
    myObject.Area()




}

class Square{
    var width = 5
    var length =5

    fun Area(){
    var area=length*width
    println("The area is $area")

    fun Perimeter(){
        var perimeter=length+length+width*2
        println("The perimeter is $perimeter")
    }


    
}
}