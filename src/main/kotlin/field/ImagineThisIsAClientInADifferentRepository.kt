package field

class ImagineThisIsAClientInADifferentRepository {
    fun formattedTotalPrice(price: Int): String? {
        val shoppingCart = ShoppingCart()
        shoppingCart.add(price)
        return java.lang.String.format("Total price is %d euro", shoppingCart.calculateTotalPrice())
    }
}