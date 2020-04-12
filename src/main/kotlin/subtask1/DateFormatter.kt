package subtask1

import java.time.DateTimeException
import java.time.DayOfWeek
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

class DateFormatter {

    // TODO: Complete the following function
    fun toTextDay(day: String, month: String, year: String): String {
        //throw NotImplementedError("Not implemented")
        var textOut = ""

        try {
            var date = LocalDate.of(year.toInt(), month.toInt(), day.toInt())

            var outForm = DateTimeFormatter.ofPattern("d MMMM, EEEE", Locale("ru"))
            textOut = date.format(outForm)

        } catch (e: Exception) {
            //println("Exception")
            textOut = "Такого дня не существует"
        }

        println(textOut)
        return textOut
    }

}