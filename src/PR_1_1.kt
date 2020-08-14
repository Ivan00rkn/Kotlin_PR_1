/* 5. максимальную четную цифру */
fun main () {
    println("Введите неотрицательное число и я найду максимальную чётную цифру: ")

    try {
        val num = readLine()
        if (num !== null && num.toLong() > 0) {
            val numeralArray: List<Int> = num.map {"$it".toInt()}
            val max = numeralArray.fold(0, { acc: Int, el: Int ->
                if (el > acc && el % 2 == 0) el else acc
            })
            println("Результат: $max")
        } else println("Неверно введено число")


    } catch (e: NumberFormatException) {
        println("Неверно введено число")
    }
}