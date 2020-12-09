package chapter4.exercise

fun inc(n: Int) = n + 1
fun dec(n: Int) = n - 1

fun addLoop(a: Int, b: Int): Int {
    var x = a
    var y = b
    while (true) {
        if (y == 0) return x
        x = inc(x)
        y = dec(y)
    }
}

tailrec fun add(a: Int, b: Int): Int = if (b == 0) a else add(inc(a), dec(b))

fun main() {
    println(add(1, 10))
}