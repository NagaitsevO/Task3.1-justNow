fun main() {
    var likes = 0

    while (likes <= 1112) {
        var ending: String = "подписчиков"
        var ones = likes % 10
        var tens = likes % 100
        if (!((tens >= 11) && (tens <= 14))) {
            when (ones) {
                1 -> ending = "подписчик"
                2 -> ending = "подписчика"
                3 -> ending = "подписчика"
                4 -> ending = "подписчика"
            }
        }
        println("У Вас $likes $ending")
        likes++
    }
}