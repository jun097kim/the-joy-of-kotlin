package chapter3.exercise

fun <A, B, C, D> curried(): (A) -> (B) -> (C) -> (D) -> String = { a: A ->
    { b: B ->
        { c: C ->
            { d: D -> "$a, $b, $c, $d" }
        }
    }
}