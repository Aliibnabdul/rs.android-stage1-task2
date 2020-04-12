package subtask5

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import kotlin.reflect.KClass

class Blocks {

    // TODO: Complete the following function
    fun getData(blockA: Array<*>, blockB: KClass<*>): Any {

        return when (blockB) {
            String::class -> {
                blockA.filter { it is String }.joinToString("")
            }
            Int::class -> {
                var al: ArrayList<Int> = blockA.filter { it is Int } as ArrayList<Int>
                al.sum()
            }
            LocalDate::class -> {
                var al = blockA.filter { it is LocalDate } as ArrayList<LocalDate>
                al.max()!!.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"))
            }
            else -> throw NotImplementedError("Not implemented")
        }
        //throw NotImplementedError("Not implemented")
    }


}
