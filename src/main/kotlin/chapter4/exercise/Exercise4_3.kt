package chapter4.exercise

import java.math.BigInteger

fun fib(x: BigInteger): BigInteger {
    var val1 = BigInteger.ONE
    var val2 = BigInteger.ONE
    var x = x
    while (true) {
        var acc: BigInteger
        if (x == BigInteger.ZERO) {
            acc = BigInteger.ONE
            println(acc)
        } else if (x == BigInteger.ONE) {
            acc = val1.add(val2)
            println(acc)
        } else {
            val sum = val1.add(val2)
            acc = val2
            val1 = acc // 숫자를 당기는 거임. 두번쨰 값이 첫번쨰 값이 됨. acc
            val2 = sum // 첫번째 값과 두번쨰 값을 더한 값이 val2임.
            x = x.subtract(BigInteger.ONE)
            println("acc: $acc, val1: $val1, val2: $val2")
            continue
        }
        return acc
    }
}

fun fib(x: Int): BigInteger {
    tailrec fun fib(val1: BigInteger, val2: BigInteger, x: BigInteger): BigInteger =
        when {
            (x == BigInteger.ZERO) -> BigInteger.ONE
            (x == BigInteger.ONE) -> val1 + val2
            else -> fib(val2, val1 + val2, x - BigInteger.ONE)
        }
    return fib(BigInteger.ZERO, BigInteger.ONE, BigInteger.valueOf(x.toLong()))
}

fun main() {
    println(fib(BigInteger.valueOf(5L)))
}
