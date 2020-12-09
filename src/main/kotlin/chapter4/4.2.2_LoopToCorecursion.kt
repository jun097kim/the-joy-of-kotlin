package chapter4.loop_to_corecursion

fun sumLoop(n: Int): Int {
    var acc = 0
    var i = 0
    while (i <= n) {
        acc += i
        i += 1
    }
    return acc
}

fun sum(n: Int): Int {
    tailrec fun sum(acc: Int, i: Int): Int = if (i > n) acc else sum(acc + i, i + 1)
    return sum(0, 0)
}

fun main() {
    println(sumLoop(10))
    println(sum(10))
}
