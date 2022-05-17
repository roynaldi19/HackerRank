fun simpleArraySum(ar: Array<Int>): Int {
    var sum = 0
    for (i in ar) {
        sum += i

    }
    return sum
}

fun main() {
   val sum = simpleArraySum(arrayOf(2, 3, 4, 5, 6, 7, 8, 10))
    println(sum)
}