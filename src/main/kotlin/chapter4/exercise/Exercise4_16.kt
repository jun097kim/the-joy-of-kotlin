package chapter4.exercise.iterate

fun <T> iterate(seed: T, f: (T) -> T, n: Int): List<T> {
    tailrec fun iterate_(acc: List<T>, seed: T): List<T> =
        if (acc.size < n) {
            iterate_(acc + seed, f(seed))
        } else {
            acc
        }
    return iterate_(listOf(), seed)
}

fun main() {
    println(iterate(0, { it + 1 }, 10))
}