package subtask1

import java.time.DateTimeException
import java.time.DayOfWeek
import java.time.LocalDate
import java.time.format.DateTimeFormatter

class DateFormatter {

    // TODO: Complete the following function
    fun toTextDay(day: String, month: String, year: String): String {
        //throw NotImplementedError("Not implemented")
        var outStr = ""

        try {
            var date = LocalDate.of(year.toInt(), month.toInt(), day.toInt())

            var monthForm = DateTimeFormatter.ofPattern("MMMM")
            val textmonth = date.format(monthForm)
            println(textmonth)

            val textDayOfTheWeek = when (date.dayOfWeek) {
                DayOfWeek.MONDAY -> "понедельник"
                DayOfWeek.TUESDAY -> "вторник"
                DayOfWeek.WEDNESDAY -> "среда"
                DayOfWeek.THURSDAY -> "четверг"
                DayOfWeek.FRIDAY -> "пятница"
                DayOfWeek.SATURDAY -> "суббота"
                DayOfWeek.SUNDAY -> "воскресенье"

                else -> "Такого дня не существует"
            }
            println(textDayOfTheWeek)

            outStr = "$day $textmonth, $textDayOfTheWeek"
        } catch (e: Exception) {
            //println("Exception")
            outStr = "Такого дня не существует"
        }

        println(outStr)
        return outStr
    }

}