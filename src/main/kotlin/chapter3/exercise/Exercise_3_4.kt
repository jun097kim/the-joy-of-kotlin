package chapter3.exercise

val compose = { f: (Int) -> Int -> { g: (Int) -> Int -> { x: Int -> f(g(x)) } } }

val square: (Int) -> Int = { n -> n * n }

val triple: (Int) -> Int = { n -> n * 3 }

val squareOfTriple = compose(square)(triple)

fun main() {
    println(squareOfTriple(2))
}
