package chapter3

import chapter3.exercise.compose
import chapter3.exercise.higherCompose

val f: (Double) -> Double = { Math.PI / 2 - it }
val sin: (Double) -> Double = Math::sin
val cos: Double = compose(f, sin)(2.0)

val cosValue: Double = compose<Double, Double, Double>(Math::sin, { Math.PI / 2 - it })(1.0)
val cos2 = (higherCompose<Double, Double, Double>())(Math::sin)({ Math.PI / 2 - it })
val cosValue2 = cos2(2.0)

fun cos(arg: Double) = compose<Double, Double, Double>(Math::sin, { x -> Math.PI / 2 - x })(arg)

val returnApplyN = { n: Int -> { f: (Int) -> Int -> f(n) } }
val apply10 = returnApplyN(10)
val twenty = apply10({ it + it })
val twenty2 = apply10 { it + it }
val twenty3 = returnApplyN(10)({ it + it })
//val twenty4Fail = returnApplyN(10) { it + it }  // Too many arguments
val twenty4Success = (returnApplyN(10)) { it + it }
