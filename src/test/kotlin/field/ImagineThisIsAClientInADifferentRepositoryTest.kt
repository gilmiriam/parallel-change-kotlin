package field

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ImagineThisIsAClientInADifferentRepositoryTest {
    @Test
    @Throws(Exception::class)
    fun singleItem_numberOfProductsInTheCart() {
        val client = ImagineThisIsAClientInADifferentRepository()
        assertEquals("Total price is 50 euro", client.formattedTotalPrice(50))
    }
}