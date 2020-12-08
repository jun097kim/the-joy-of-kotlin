package chapter3.exercise

import chapter3.square
import chapter3.triple

fun <A, B, C> compose(f: (B) -> C, g: (A) -> B): (A) -> C {
    return { x -> f(g(x)) }
}

fun main() {
    val squareOfTriple = compose(::square, ::triple)
    println(squareOfTriple(2))
}
