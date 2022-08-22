package field

import org.junit.jupiter.api.Test
import kotlin.test.*

class ShoppingCartTest {
    @Test
    @Throws(Exception::class)
    fun singleItem_numberOfProductsInTheCart() {
        val shoppingCart = ShoppingCart()
        shoppingCart.add(10)
        assertEquals(1, shoppingCart.numberOfProducts())
    }

    @Test
    @Throws(Exception::class)
    fun singleItem_totalPrice() {
        val shoppingCart = ShoppingCart()
        shoppingCart.add(10)
        assertEquals(10, shoppingCart.calculateTotalPrice())
    }

    @Test
    @Throws(Exception::class)
    fun singleItem_hasDiscountIfContainsAtLeastOneProductWorthAtLeast100() {
        val shoppingCart = ShoppingCart()
        shoppingCart.add(100)
        assertTrue(shoppingCart.hasDiscount())
    }

    @Test
    @Throws(Exception::class)
    fun singleItem_doesNotHaveDiscountIfContainsNoProductsWorthAtLeast100() {
        val shoppingCart = ShoppingCart()
        shoppingCart.add(99)
        assertFalse(shoppingCart.hasDiscount())
    }
}