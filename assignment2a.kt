fun main(){
    val points=1200

    if (points>0 && points<100 ){
     println("you do not qualify")

    }
    

    else if(points>101 && points<400){
     println("you win  Smartphone")

    }
   

    else if(points>401 && points<1000){
     println("you win a laptop")
    }
   

    else if(points>=1000 && points<=2000){
    println("you win a trip to canada")
    }
    

    else{
    println("you do not qualify")
    }

}