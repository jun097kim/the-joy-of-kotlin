package chapter4.memoization_in_loop

import java.lang.IllegalArgumentException
import java.lang.StringBuilder
import java.math.BigInteger

fun fibo(limit: Int): String =
    when {
        limit < 1 -> throw IllegalArgumentException()
        limit == 1 -> "1"
        else -> {
            var fibo1 = BigInteger.ONE
            var fibo2 = BigInteger.ONE
            var fibonacci: BigInteger
            val builder = StringBuilder("1, 1")
            for (i in 2 until limit) {
                fibonacci = fibo1.add(fibo2)
                builder.append(", ").append(fibonacci)
                fibo1 = fibo2
                fibo2 = fibonacci
            }
            builder.toString()
        }
    }

fun main() {
    println(fibo(10))
}
