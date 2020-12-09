package chapter4.recursive_to_string

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

fun toString(list: List<Char>): String =
    if (list.isEmpty())
        ""
    else prepend(list.head(), toString(list.tail()))

fun main() {
    println(toString(listOf('a', 'b', 'c')))
}