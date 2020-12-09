package chapter4.corecursion_to_loop

fun append(s: String, c: Char) = "$s$c"

fun toStringCorec2(list: List<Char>): String {
    var s = ""
    for (c in list) s = append(s, c)
    return s
}

fun main() {
    println(toStringCorec2(listOf('a', 'b', 'c')))
}