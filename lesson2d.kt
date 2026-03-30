fun main() {
    val marks=90

    if (marks>0 && marks<=30){
        println("Below average")
    }

    else if(marks>31 && marks<=50){
        println("Average")
    }

    else if(marks>51 && marks<=70){
        println("Above average")
    }

    else if (marks>71 && marks<=100){
        println("You have Passed")
    }


    else{
        println("Invalid marks")
    }
}