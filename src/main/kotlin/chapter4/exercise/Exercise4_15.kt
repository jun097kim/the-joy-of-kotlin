package chapter4.exercise.memoization_in_recursive_functions

import java.math.BigInteger

fun fibo(number: Int): String {
    tailrec fun fibo(acc: List<BigInteger>, acc1: BigInteger, acc2: BigInteger, x: BigInteger): List<BigInteger> {
        println("acc: $acc, acc1: $acc1, acc2: $acc2, x: $x")
        return when (x) {
            BigInteger.ZERO -> acc
            BigInteger.ONE -> acc + (acc1 + acc2)
            else -> fibo(acc + (acc1 + acc2), acc2, acc1 + acc2, x - BigInteger.ONE)
        }
    }
    val list = fibo(listOf(), BigInteger.ONE, BigInteger.ZERO, BigInteger.valueOf(number.toLong()))
    return list.joinToString()
}

fun main() {
    println(fibo(5))
}