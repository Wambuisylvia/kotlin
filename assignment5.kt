fun main(){

    val myObject=Manager()
    myObject.managing()
  

   

}

open class Manager{
    fun managing(){
        println("managing the company")
    }
}
class Employee:Manager(){
    fun Working(){
        println("Working in the company")
    }
}
