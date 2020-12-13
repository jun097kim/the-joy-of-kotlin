package chapter4.exercise.map

import chapter4.exercise.fold_left.foldLeft
import chapter4.exercise.head
import chapter4.exercise.tail

fun <T, U> map(list: List<T>, f: (T) -> U): List<U> {
    tailrec fun map_(acc: List<U>, list: List<T>): List<U> =
        if (list.isEmpty()) {
            acc
        } else {
            map_(acc + f(list.head()), list.tail())
        }
    return map_(listOf(), list)
}

fun <T, U> mapWithCopy(list: List<T>, f: (T) -> U): List<U> =
    foldLeft(list, listOf(), { acc, elem -> acc + f(elem) })

fun main() {
    println(map(listOf(1, 2, 3)) { it * it })
}