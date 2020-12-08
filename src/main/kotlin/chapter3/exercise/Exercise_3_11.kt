package chapter3.exercise

fun <A, B, C> swapArgs(f: (A) -> (B) -> C): (B) -> (A) -> C = { b: B ->
    { a: A ->
        f(a)(b)
    }
}