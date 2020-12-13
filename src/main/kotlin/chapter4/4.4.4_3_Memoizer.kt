package chapter4.memoizer

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

fun main() {
    val f: (Int) -> Int = { it * 2 }
    val g: (Int) -> Int = Memoizer.momoize(f)
}