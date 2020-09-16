fun minutesForm(seconds: Int): String {
    var startMessageString = "был(а) в сети "
    var ending: String = " минут "
    var minutes = seconds / 60

    var ones = minutes % 10
    var tens = minutes % 100
    if (!((tens >= 11) && (tens <= 14))) {
        when (ones) {
            1 -> ending = " минуту "
            2 -> ending = " минуты "
            3 -> ending = " минуты "
            4 -> ending = " минуты "
        }
    }
    return startMessageString + minutes + ending + "назад"
}