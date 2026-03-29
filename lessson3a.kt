fun main(){
    for(number in 1..10){
    println(number)}

    println("")

    for (counter in 20..50){
        println("The counter is  $counter")
    }

    for(i in 10..50 step 2){
        println("The number is $i")
    }

    for(i in 50..60 step 5){
        println("The number is $i")
    }


    //printing downwards

    for (numbers in 10 downTo 1){
        println("The number is $numbers")
    }

    
}