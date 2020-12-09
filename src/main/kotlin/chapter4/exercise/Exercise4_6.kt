package chapter4.exercise.fold_right

import java.lang.IllegalArgumentException

fun prepend(c: Char, s: String): String = "$c$s"

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

fun <T, U> foldRight(list: List<T>, identity: U, f: (T, U) -> U): U =
    if (list.isEmpty())
        identity
    else
        f(list.head(), foldRight(list.tail(), identity, f))

fun toString(list: List<Char>): String = foldRight(list, "") { c, s -> prepend(c, s) }