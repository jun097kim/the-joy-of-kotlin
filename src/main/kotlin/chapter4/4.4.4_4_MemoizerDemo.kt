package chapter4.memoizer_demo

import java.util.concurrent.ConcurrentHashMap

class Memoizer<T, U> private constructor() {
    private val cache = ConcurrentHashMap<T, U>()

    private fun doMemoize(function: (T) -> U): (T) -> U = { input ->
        cache.computeIfAbsent(input) {
            function(it)
        }
    }

    companion object {
        fun <T, U> momoize(function: (T) -> U): (T) -> U =
            Memoizer<T, U>().doMemoize(function)
    }
}

fun longComputation(number: Int): Int {
    Thread.sleep(1000)
    return number
}

fun main() {
    val startTime1 = System.currentTimeMillis()
    val result1 = longComputation(43)
    val time1 = System.currentTimeMillis() - startTime1

    val memoizedLongComputation = Memoizer.momoize(::longComputation)
    val startTime2 = System.currentTimeMillis()
    val result2 = memoizedLongComputation(43)
    val time2 = System.currentTimeMillis() - startTime2

    val startTime3 = System.currentTimeMillis()
    val result3 = memoizedLongComputation(43)
    val time3 = System.currentTimeMillis() - startTime3

    println("Call to nonmemoized function: result = $result1, time = $time1")
    println("First call to memoized function: result = $result2, time = $time2")
    println("Second call to memoized function: result = $result3, time = $time3")
}