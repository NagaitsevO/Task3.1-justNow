fun main() {
    var seconds = 0
    var unitOfTime = toFindUnitsOfTime(seconds)
    var message = "Время не определено"

    while (seconds <= 3600) {
        unitOfTime = toFindUnitsOfTime(seconds)
        when (unitOfTime) {
            unitsOfTime.JUST_NOW -> message = justNowForm(seconds)
            unitsOfTime.MINUTES_AGO -> message = minutesForm(seconds)
            unitsOfTime.HOURS_AGO -> message = hoursForm(seconds)
            unitsOfTime.TODAY -> message = todayForm(seconds)
            unitsOfTime.YESTERDAY -> message = yesterdayForm(seconds)
            unitsOfTime.LONG_TIME_AGO -> message = longTimeAgoForm(seconds)
        }
        println(message)
        seconds += 60
    }

    while (seconds <= 24 * 3600) {
        unitOfTime = toFindUnitsOfTime(seconds)
        when (unitOfTime) {
            unitsOfTime.JUST_NOW -> message = justNowForm(seconds)
            unitsOfTime.MINUTES_AGO -> message = minutesForm(seconds)
            unitsOfTime.HOURS_AGO -> message = hoursForm(seconds)
            unitsOfTime.TODAY -> message = todayForm(seconds)
            unitsOfTime.YESTERDAY -> message = yesterdayForm(seconds)
            unitsOfTime.LONG_TIME_AGO -> message = longTimeAgoForm(seconds)
        }
        println(message)
        seconds += 3600
    }

    while (seconds <= 73 * 3600) {
        unitOfTime = toFindUnitsOfTime(seconds)
        when (unitOfTime) {
            unitsOfTime.JUST_NOW -> message = justNowForm(seconds)
            unitsOfTime.MINUTES_AGO -> message = minutesForm(seconds)
            unitsOfTime.HOURS_AGO -> message = hoursForm(seconds)
            unitsOfTime.TODAY -> message = todayForm(seconds)
            unitsOfTime.YESTERDAY -> message = yesterdayForm(seconds)
            unitsOfTime.LONG_TIME_AGO -> message = longTimeAgoForm(seconds)
        }
        println(message)
        seconds += 24 * 3600
    }

}