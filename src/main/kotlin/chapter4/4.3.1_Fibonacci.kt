package chapter4.fibonacci

fun fibonacci(number: Int): Int =
    if (number == 0 || number == 1)
        1
    else
        fibonacci(number - 1) + fibonacci(number - 2)

fun main() {
    (0 until 1000).forEach { println("${fibonacci(it)}") }
}