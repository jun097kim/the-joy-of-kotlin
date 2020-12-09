package chapter4.recursion_2

fun prepend(c: Char, s: String): String = "$c$s"

fun toString(list: List<Char>): String =
    if (list.isEmpty()) {
        ""
    } else {
        prepend(list[0], toString(list.subList(1, list.size)))
    }

fun main() {
    println(toString(listOf('a', 'b', 'c')))
}