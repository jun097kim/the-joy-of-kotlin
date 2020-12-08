package chapter3.closure

val taxRate = 0.09

fun addTax(price: Double) = price + price * taxRate

fun main() {
    println(addTax(12.0))
}