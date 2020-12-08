package chapter3.exercise

fun <A, B, C> curry(f: (A, B) -> C): (A) -> (B) -> C = { a: A ->
    { b: B ->
        f(a, b)
    }
}