package chapter4.manual_memoization_1

object Doubler {
    private val cache: MutableMap<Int, Int> = mutableMapOf()
    fun double(x: Int) = cache.computeIfAbsent(x) { it * 2 }
}

fun main() {
    println(Doubler.double(2))
}