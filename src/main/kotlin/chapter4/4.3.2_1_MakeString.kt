package chapter4.make_string

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

fun <T> makeString(list: List<T>, delim: String) : String =
    when {
        list.isEmpty() -> ""
        list.tail().isEmpty() -> "${list.head()}"
        else  -> "${list.head()}$delim${makeString(list.tail(), delim)}"
    }

fun main() {
    println(makeString(listOf<String>(), ","))
    println(makeString(listOf("a", "b", "c"), ","))
}