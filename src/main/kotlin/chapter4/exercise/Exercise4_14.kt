package chapter4.exercise.corecursive_unfold

fun <T> unfold(seed: T, f: (T) -> T, p: (T) -> Boolean): List<T> {
    tailrec fun <T> _unfold(acc: List<T>, seed: T, f: (T) -> T, p: (T) -> Boolean): List<T> =
        if (p(seed)) {
            _unfold(acc + seed, f(seed), f, p)
        } else {
            acc
        }
    return _unfold(listOf(), seed, f, p)
}

fun main() {
    println(unfold(0, { it + 1 }, { it < 10 }))
}