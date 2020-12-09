package chapter4.exercise.range_with_unfold

fun <T> unfold(seed: T, f: (T) -> T, p: (T) -> Boolean): List<T> {
    val result: MutableList<T> = mutableListOf()
    var elem = seed
    while (p(elem)) {
        result.add(elem)
        elem = f(elem)
    }
    return result
}

fun range(start: Int, end: Int): List<Int> =
    unfold(start, { it + 1 }, { it < end })

fun main() {
    println(range(0, 10))
}