fun main() {

    // if and else if statement

    var first = 56
    var second = 87
    var third = 20

    if (first > second && first > third){
        println("$first, is the largest number")
    }

    else if (second > first && second > third){
        println("$second, is the largest number")

    }
    else if (third > first && third > second){
        println("$third, is the largest number")
    }


    // when statement
    var number = readln().toInt()

    var dayofweek = when(number){
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Neverday"
    }
    println("today is $dayofweek")

    // check loops statements for continuation of control statements




}