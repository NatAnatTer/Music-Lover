var scan = java.util.Scanner(System.`in`)
fun main() {
    val user1 = "111"
    val user2 = "222"
    var isConstantlyUser = false
    val minPrice = 1000_00
    val maxPrise = 10_000_00
    var previousSum = 0
    var totalSumWithDiscount: Double = 0.0
    println("Введите loin пользователя:")
    val user = scan.nextLine()
    if (user.equals(user1)) {
    } else {
        isConstantlyUser = true
    }
    println("Введите предыдущую сумму в копейках:")
    previousSum = scan.nextInt()

    println("Введите сумму покупки в копейках:")
    while (true) {
        val totalSum = scan.nextInt()
        if (previousSum <= minPrice) {
            totalSumWithDiscount = totalSum.toDouble()
        } else if (previousSum in (minPrice + 1)..maxPrise) {
            totalSumWithDiscount = (totalSum - 10000).toDouble()
        } else if (previousSum > maxPrise) {
            totalSumWithDiscount = totalSum * 0.95
        }
        if (isConstantlyUser) {
            totalSumWithDiscount *= 0.99
        }
        previousSum = totalSum
        totalSumWithDiscount /= 100
        println("Сумма покупки составляет: $totalSumWithDiscount RUB")
        println("Введите сумму покупки в копейках:")
    }


}