package chapter4.corecursive_sum

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

fun sum(list: List<Int>): Int {
    fun sumTail(list: List<Int>, acc: Int): Int =
        if (list.isEmpty())
            acc
        else
            sumTail(list.tail(), acc + list.head())
    if (list.isEmpty())
        0
    else
        list.head() + sum(list.tail())
    return sumTail(list, 0)
}