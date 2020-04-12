package subtask2

class TimeConverter {

    // TODO: Complete the following function
    fun toTextFormat(hour: String, minute: String): String {
        val h = hour.toInt()

        val m = minute.toInt()
        var s = ""
        when (m) {
            0 -> s += "${ intToText(h) } o' clock"
            15 -> s += "quarter past ${ intToText(h) }"
            30 -> s += "half past ${ intToText(h) }"
            45 -> s += "quarter to ${ intToText(h + 1) }"
            in 1..30 -> s += "${intToText(m)} minutes past ${ intToText(h) }"
            in 31..60 -> s += "${intToText(60- m)} minutes to ${ intToText(h + 1 ) }"
        }

        println(s)
        //throw NotImplementedError("Not implemented")
        return s
    }

    fun intToText (i: Int) =
        when(i) {
            1 -> "one"
            2 -> "two"
            3 -> "three"
            4 -> "four"
            5 -> "five"
            6 -> "six"
            7 -> "seven"
            8 -> "eight"
            9 -> "nine"
            10 -> "ten"
            11 -> "eleven"
            12 -> "twelve"
            13 -> "thirteen"
            14 -> "fourteen"
            15 -> "quarter"
            16 -> "sixteen"
            17 -> "seventeen"
            18 -> "eighteen"
            19 -> "nineteen"
            20 -> "twenty"
            21 -> "twenty one"
            22 -> "twenty two"
            23 -> "twenty three"
            24 -> "twenty four"
            25 -> "twenty five"
            26 -> "twenty six"
            27 -> "twenty seven"
            28 -> "twenty eight"
            29 -> "twenty nine"

            else -> ""
        }
}
