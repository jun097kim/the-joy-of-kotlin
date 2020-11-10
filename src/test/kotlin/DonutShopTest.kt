import chapter1.CreditCard
import chapter1.Donut
import chapter1.buyDonuts
import org.junit.Test
import kotlin.test.assertEquals

class DonutShopTest {
    @Test
    fun testBuyDonuts() {
        val creditCard = CreditCard()
        val purchase = buyDonuts(5, creditCard)
        assertEquals(Donut.price * 5, purchase.payment.amount)
        assertEquals(creditCard, purchase.payment.creditCard)
    }
}