package chapter4.exercise

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

fun <T> makeString(list: List<T>, delim: String) : String {
    tailrec fun makeString_(list: List<T>, acc: String): String =
        when {
            list.isEmpty() -> acc
            list.tail().isEmpty() -> makeString_(list.tail(), "$acc${list.head()}")
            else -> makeString_(list.tail(), "$acc${list.head()}$delim")
        }
    return makeString_(list, "")
}

fun main() {
    println(makeString(listOf<String>(), ","))
    println(makeString(listOf("a", "b", "c"), ","))
}