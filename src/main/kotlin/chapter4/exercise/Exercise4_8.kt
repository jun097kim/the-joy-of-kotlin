package chapter4.exercise.without_single_list

import chapter4.exercise.fold_left.foldLeft

fun <T> copy(list: List<T>): List<T> = foldLeft(list, listOf(), { lst, elm -> lst + elm })

fun <T> prepend(list: List<T>, elem: T): List<T> =
    foldLeft(list, listOf(elem)) { lst, elm -> lst + elm }

fun <T> reverse(list: List<T>): List<T> {
    return foldLeft(list, listOf(), ::prepend)
}

fun main() {
    println(prepend(listOf(2, 3, 4, 5), 1))
    println(reverse(listOf(1, 2, 3, 4, 5)))
}