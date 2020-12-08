package chapter3.exercise

fun <T, U, V> higherAndThen(): ((T) -> U) -> ((U) -> V) -> (T) -> V = { f ->
    { g ->
        { x -> g(f(x)) }
    }
}

fun main() {
    val squareOfTriple = higherAndThen<Int, Int, Int>()(triple)(square)
    println(squareOfTriple(2))
}
