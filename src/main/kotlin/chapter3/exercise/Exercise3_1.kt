package chapter3.exercise

import chapter3.square
import chapter3.triple

fun compose(f: (Int) -> Int, g: (Int) -> Int): (Int) -> Int {
    return { x -> f(g(x)) }
}

fun main() {
    val squareOfTriple = compose(::square, ::triple)
    println(squareOfTriple(2))
}
