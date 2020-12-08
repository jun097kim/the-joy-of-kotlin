package chapter3.exercise

fun <A, B, C> partialA(a: A, f: (A) -> (B) -> C): (B) -> C = f(a)