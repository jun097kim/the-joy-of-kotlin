package chapter4.exercise.recursive_range

import chapter4.exercise.fold_left.foldLeft

fun <T> prepend(list: List<T>, initialValue: T): List<T> {
    println("list: $list, elem: $initialValue")
    return foldLeft(list, listOf(initialValue)) { acc, head -> acc + head }
}

fun range(start: Int, end: Int): List<Int> =
    if (end <= start) {
        listOf()
    } else {
        prepend(range(start + 1, end), start)
    }

fun main() {
    println(range(0, 10))
}