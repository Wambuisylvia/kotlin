fun main(){
    var marks=50

    when(marks){
      in  0..30->println("below average")
      in  31..50->println("average")
      in  51..70->println("Above Average")
      in  71..100->println("You have passed")

       else->println("invalid marks")

    }

    val day=4
    when(day){
        1->println("monday")
        2->println("Tuesday")
        3->println("wednesday")
        4->println("Thusrday")
        5->println("Friday")
        6->println("saturday")
        7->println("Sunday")

        
    
}
}