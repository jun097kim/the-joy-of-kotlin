package chapter3.exercise

fun <A, B, C> higherCompose(): ((B) -> C) -> ((A) -> B) -> (A) -> C = { f ->
    { g ->
        { x -> f(g(x)) }
    }
}

fun main() {
    val squareOfTriple = higherCompose<Int, Int, Int>()(square)(triple)
}
