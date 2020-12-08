import chapter3.exercise.higherCompose
import kotlin.test.Test
import kotlin.test.assertEquals

class HigherComposeTest {

    @Test
    fun testHigherCompose() {
        val f: (Double) -> Int = { a -> (a * 3).toInt() }
        val g: (Long) -> Double = { a -> a + 2.0 }

        assertEquals(Integer.valueOf(9), f(g(1L)))
        assertEquals(Integer.valueOf(9), higherCompose<Long, Double, Int>()(f)(g)(1L))
    }
}
