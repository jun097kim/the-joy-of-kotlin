package chapter4.choosing_recursion_or_corecursion

fun sum(a: Int, b: Int): Int = a + b

fun corecursiveSum(acc: Int, list: List<Int>): Int =
    if (list.isEmpty()) {
        acc
    } else {
        corecursiveSum(sum(acc, list[0]), list.subList(1, list.size))
    }

fun recursiveSum(list: List<Int>): Int =
    if (list.isEmpty()) {
        0
    } else {
        sum(list[0], recursiveSum(list.subList(1, list.size)))
    }

fun main() {
    println(corecursiveSum(0, (1..10).toList()))
    println(recursiveSum((1..10).toList()))
}