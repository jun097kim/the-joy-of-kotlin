package chapter4.exercise.recursive_unfold

import chapter4.exercise.fold_left.foldLeft

fun <T> prepend(list: List<T>, initialValue: T): List<T> {
    return foldLeft(list, listOf(initialValue)) { acc, head -> acc + head }
}

fun <T> unfold(seed: T, f: (T) -> T, p: (T) -> Boolean): List<T> =
    if (p(seed)) {
        prepend(unfold(f(seed), f, p), seed)
    } else {
        listOf()
    }

fun main() {
    println(unfold(0, { it + 1 }, { it < 10 }))
}