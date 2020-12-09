package chapter4.exercise.with_single_list

import chapter4.exercise.fold_left.foldLeft

fun <T> prepend(list: List<T>, elem: T): List<T> =
    listOf(elem) + list

fun <T> reverse(list: List<T>): List<T> {
    return foldLeft(list, listOf(), ::prepend)
}

fun main() {
    println(reverse(listOf(1, 2, 3, 4, 5)))
}