fun toFindUnitsOfTime(seconds: Int): unitsOfTime {
    var unitOfTime = unitsOfTime.JUST_NOW

    if ((seconds >= 0) && (seconds <= 59)) {
        unitOfTime = unitsOfTime.JUST_NOW
    } else {
        if ((seconds >= 60) && (seconds <= 60 * 60 - 1)) {
            unitOfTime = unitsOfTime.MINUTES_AGO
        } else {
            if ((seconds >= 60 * 60) && (seconds <= 24 * 60 * 60 - 1)) {
                unitOfTime = unitsOfTime.HOURS_AGO
            } else {
                if ((seconds >= 24 * 60 * 60) && (seconds <= 48 * 60 * 60 - 1)) {
                    unitOfTime = unitsOfTime.TODAY
                } else {
                    if ((seconds >= 48 * 60 * 60) && (seconds <= 72 * 60 * 60 - 1)) {
                        unitOfTime = unitsOfTime.YESTERDAY
                    } else {
                        if (seconds >= 72 * 60 * 60) {
                            unitOfTime = unitsOfTime.LONG_TIME_AGO
                        }
                    }
                }
            }
        }
    }
    return unitOfTime
}



/*Если количество секунд от 0 до 60, работает вариант с только что
>=0 && <=60 -> JUST_NOW
Если количество секунд от 61 до 60 * 60 (один час), работает вариант с x минут назад
>=61 <= 60*60 -> MINUTES
Если количество секунд от 60 * 60 + 1 до 24 * 60 * 60 (сутки) и , работает вариант с x часов назад
>= 60 * 60 + 1 && <= 24 * 60 * 60 -> HOURS
Если количество секунд от суток до двух, то - сегодня
>= 24 * 60 * 60 + 1 && <= 48 * 60 * 60 -> TODAY
Если количество секунд от двух суток до трёх, то - вчера
>= 48 * 60 * 60 + 1 && <= 72 * 60 * 60 -> YESTERDAY
Если количество секунд больше трёх суток, то - давно
>= 72 * 60 * 60 + 1 -> LONG_TIME_AGO */