package subtask3

class Abbreviation {

    // TODO: Complete the following function
    fun abbreviationFromA(a: String, b: String): String {
        var newStrA = ""
        for(chA in a){
            println(chA)
            for(chB in b) {
                if (chB.equals(chA, ignoreCase = true)) newStrA += chA.toUpperCase()
            }
        }
        println("$newStrA, $b")
        return if (newStrA.equals(b)) "YES"
        else "NO"
        //throw NotImplementedError("Not implemented")
    }
}
