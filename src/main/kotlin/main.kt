fun main() {
    val amount = 1000_000
    val discount = if (amount * 0.0075 >= 3500) amount * 0.0075 else 3500
    println(discount)
}