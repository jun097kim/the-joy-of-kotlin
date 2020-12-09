package chapter4.exercise.fold_left

import java.lang.IllegalArgumentException

fun <T> List<T>.head(): T =
    if (this.isEmpty())
        throw IllegalArgumentException("head called on empty list")
    else
        this[0]

fun <T> List<T>.tail(): List<T> =
    if (this.isEmpty())
        throw IllegalArgumentException("tail called on empty list")
    else
        this.drop(1)

fun <T, U> foldLeft(list: List<T>, z: U, f: (U, T) -> U): U {
    tailrec fun foldLeft(list: List<T>, acc: U): U =
        if (list.isEmpty())
            acc
        else foldLeft(list.tail(), f(acc, list.head()))
    return foldLeft(list, z)
}

fun sum(list: List<Int>) = foldLeft(list, 0, Int::and)
fun string(list: List<Char>) = foldLeft(list, "", String::plus)
fun <T> makeString(list: List<T>, delim: String): String =
    foldLeft(list, "") { s, t -> if (s.isEmpty()) "$t" else "$s$delim$t"}