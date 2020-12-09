package chapter4.exercise.unfold_with_loop

fun <T> unfold(seed: T, f: (T) -> T, p: (T) -> Boolean): List<T> {
    val result: MutableList<T> = mutableListOf()
    var elem = seed
    while (p(elem)) {
        result.add(elem)
        elem = f(elem)
    }
    return result
}

fun main() {
    println(unfold(0, { i -> i + 1 }, { i -> i < 10 }))
}