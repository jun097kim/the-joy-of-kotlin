package chapter4.manual_memoization

val cache: MutableMap<Int, Int> = mutableMapOf()

fun double(x: Int) = cache.computeIfAbsent(x) { it * 2 }

fun main() {
    println(double(2))
}