package chapter4.recursive_factorial_with_big_integer

import java.math.BigInteger

fun factorial(n: BigInteger): BigInteger =
    if (n == BigInteger.ZERO)
        BigInteger.ONE
    else
        n * factorial(n - BigInteger.ONE)

fun main() {
    println(factorial(BigInteger.valueOf(13)))
}
