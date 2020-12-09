package chapter4.recursive_sum

fun sum(list: List<Int>): Int =
    if (list.isEmpty()) 0 else list[0] + sum(list.drop(1))