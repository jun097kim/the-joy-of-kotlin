package chapter4.corecursion_local_functions

fun append(s: String, c: Char) = "$s$c"

fun toString(list: List<Char>): String {
    fun toString(list: List<Char>, s: String): String =
        if (list.isEmpty()) {
            s
        } else {
            toString(list.drop(1), append(s, list.first()))
        }
    return toString(list, "")
}

fun main() {
    println(toString(listOf('a', 'b', 'c')))
}