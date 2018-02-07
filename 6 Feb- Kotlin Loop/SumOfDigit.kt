

fun main(args: Array<String>) {

    var userValue = 333
    var remainder : Int
    var sum = 0

    while(userValue>0){ // 1>0
        remainder = userValue % 10 // 1 % 10
        sum += remainder // 0 + 3  = sum = 3 + 2 = 5 + 1 = 6
        userValue /=  10 //1/10
    }

    println(sum)

}