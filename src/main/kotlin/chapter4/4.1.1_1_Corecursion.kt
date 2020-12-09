package chapter4.corecursion

fun append(s: String, c: Char) = "$s$c"

fun toString(list: List<Char>, s: String): String =
    if (list.isEmpty()) {
        s
    } else {
        toString(list.subList(1, list.size), append(s, list[0]))
    }

fun main() {
    println(toString(listOf('a', 'b', 'c'), ""))
}