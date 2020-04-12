package subtask4

import java.io.File.separator
import java.util.*
import kotlin.collections.ArrayList

class Pangram {

    // TODO: Complete the following function
    fun getResult(inputString: String): String {
        var outStr = ""
        // is blank:
        if (inputString.isBlank() ) return outStr // true, если пустая строка или пустые символы пробела, табуляции и т.п.

        var inStr = inputString.trim()
        var outAl: ArrayList<String> = f_panStr(inStr)

        outAl.removeIf{ it.contains('\n') }
        outAl.sortBy { it[0] } // сортировка по первым символам строк
        outStr = outAl.joinToString ( separator = " ") //
        println("outStr - $outStr")
        return outStr
        //throw NotImplementedError("Not implemented")
    }

    fun isPan (st: String): Boolean {
        println("fun isPan")
        if (st.length<26) return false

        for (i in 'a'..'z' ){
            if( !st.contains(i, ignoreCase = true) ) {
                return false
            }
        }
        return true
    }

    private fun f_panStr(st: String): ArrayList<String> {
        println("fun f_panStr")
        val words = st.split(' ')
        //words.forEach{ wo -> println(wo) }
        val resultArr = ArrayList<String>()
        var tempStr = String()
        val ip: Boolean = isPan(st)
        for (w in words){
            var counter = 0
            for (c in w){ // считаем гласные
                if ( ip ) {
                    //println("it's panagram")
                    if ( "aeiouy".contains(c, ignoreCase = true ) ){ // любая буква из перечисленных
                        counter++
                        tempStr += c.toUpperCase()
                    }
                    else tempStr += c
                }
                else {
                    //println("it's not panagram")
                    if ( c.isLetter() and !"aeiouy".contains(c, ignoreCase = true ) ){ // если буква и согласная
                        counter++
                        tempStr += c.toUpperCase()
                    }
                    else tempStr += c

                }

            }
            //println("tempStr - $tempStr")

            if (tempStr.isNotEmpty()) resultArr.add(counter.toString() + tempStr)
            tempStr = ""
        }
        return resultArr
    }

}
