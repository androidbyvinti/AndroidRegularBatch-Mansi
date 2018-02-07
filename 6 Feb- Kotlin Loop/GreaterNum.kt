

fun main(args: Array<String>) {

    var first = 120
    var second = 54
    var third = 90

    when{
        first > second && first > third -> println("First is greater")
        second > third -> println("Second is greater")
        else -> println("Third is greater")
    }
}