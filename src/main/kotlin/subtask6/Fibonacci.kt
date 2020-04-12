package subtask6

import java.util.ArrayList

class Fibonacci {

    // TODO: Complete the following function
    fun productFibonacciSequenceFor(n: Int): IntArray {

        var al = mutableListOf(0, 1)
        var outArr = IntArray(3)
        for (i in 2..n) {
            al.add(al[i - 1] + al[i - 2])

            if (al[i] * al[i - 1] >= n) {
                outArr[0] = al[i - 1]
                outArr[1] = al[i]

                if (al[i] * al[i - 1] == n) outArr[2] = 1
                else outArr[2] = 0

                break
            }
        }
        outArr.forEach { println(it) }
        return outArr
//        throw NotImplementedError("Not implemented")
    }
}
