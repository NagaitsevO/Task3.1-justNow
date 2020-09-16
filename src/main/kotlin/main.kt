fun main() {
    var seconds = 0
    var unitOfTime = toFindUnitsOfTime(seconds)
    var message = "Время не определено"

    while (seconds <= 3600) {
        unitOfTime = toFindUnitsOfTime(seconds)
        when (unitOfTime) {
            unitsOfTime.JUST_NOW -> message = justNowForm(seconds)
            unitsOfTime.MINUTES_AGO -> message = minutesForm(seconds)
        }
        println(message)
        seconds++
    }


}