package chapter3.exercise

fun <A, B, C> partialA(b: B, f: (A) -> (B) -> C): (A) -> C = { a: A -> f(a)(b) }