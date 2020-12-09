package chapter4.exercise

object Factorial {
    val factorial: (Int) -> Int by lazy { { n -> if (n <= 1) n else n * factorial(n - 1) } }
}

fun main() {
    println(Factorial.factorial(34))
}