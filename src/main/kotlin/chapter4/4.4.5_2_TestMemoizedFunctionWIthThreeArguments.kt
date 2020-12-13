package chapter4.test_memoized_function_with_three_arguments

import chapter4.memoizer.Memoizer
import chapter4.memoizer_demo.longComputation

val f3m = Memoizer.momoize { x: Int ->
    Memoizer.momoize { y: Int ->
        Memoizer.momoize { z: Int ->
            longComputation(z) - (longComputation(y) + longComputation(x))
        }
    }
}

fun main() {
    val startTime1 = System.currentTimeMillis()
    val result1 = f3m(41)(42)(43)
    val time1 = System.currentTimeMillis() - startTime1

    val startTime2 = System.currentTimeMillis()
    val result2 = f3m(41)(42)(43)
    val time2 = System.currentTimeMillis() - startTime2

    println("First call to memoized function: result = $result1, time = $time1")
    println("Second call to memoized function: result = $result2, time = $time2")
}