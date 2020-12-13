package chapter4.memoized_function_of_tuple4

import chapter4.memoizer_demo.Memoizer
import chapter4.memoizer_demo.longComputation

data class Tuple4<T, U, V, W>(val first: T, val second: U, val third: V, val fourth: W)

val ft = { (a, b, c, d): Tuple4<Int, Int, Int, Int> ->
    longComputation(a) + longComputation(b) - longComputation(c) * longComputation(d)
}

val ftm = Memoizer.momoize(ft)

fun main() {
    val startTime1 = System.currentTimeMillis()
    val result1 = ftm(Tuple4(40, 41, 42, 43))
    val time1 = System.currentTimeMillis() - startTime1

    val startTime2 = System.currentTimeMillis()
    val result2 = ftm(Tuple4(40, 41, 42, 43))
    val time2 = System.currentTimeMillis() - startTime2

    println("First call to memoized function: result = $result1, time = $time1")
    println("Second call to memoized function: result = $result2, time = $time2")
}