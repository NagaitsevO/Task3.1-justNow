fun hoursForm(seconds: Int): String {
    var startMessageString = "был(а) в сети "
    var ending: String = " часов "
    var hours = seconds / 60 / 60

    var ones = hours % 10
    var tens = hours % 100
    if (!((tens >= 11) && (tens <= 14))) {
        when (ones) {
            1 -> ending = " час "
            2 -> ending = " часа "
            3 -> ending = " часа "
            4 -> ending = " часа "
        }
    }
    return startMessageString + hours + ending + "назад"
}