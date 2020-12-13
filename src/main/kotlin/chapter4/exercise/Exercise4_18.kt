package chapter4.exercise.corecursive_fibonacci

import chapter4.exercise.fold_left.makeString
import chapter4.exercise.iterate.iterate
import chapter4.exercise.map.map
import java.math.BigInteger

fun fiboCorecursive(number: Int): String {
    val seed = Pair(BigInteger.ZERO, BigInteger.ONE)
    val f = { (a, b): Pair<BigInteger, BigInteger> ->
        Pair(b, a + b)
    }
    val listOfPairs = iterate(seed, f, number + 1)
    println(listOfPairs)
    val list = map(listOfPairs) { p -> p.first }
    return makeString(list, ", ")
}

fun main() {
    println(fiboCorecursive(5))
}