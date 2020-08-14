/* 5. В строке указано несколько неотрицательных целых чисел,
разделенных пробелами (по одному пробелу между числами).
Какие цифры присутствуют ровно в двух числах? */

fun main () {
    println("Введите неотрицательные числа через пробел")
    val input = readLine()
    if (input == null || input == "") {
        println("Ошибка! Введите числа через пробел")
        return
    }
    val inputNembers: List<String> = input.split(" ")
    if (inputNembers.size < 2) {
        println("Чисел должно быть минимум 2")
        return
    }

    try {
        for (num in inputNembers) {
            if (num.toLong() < 0) {
                println("Числа должны быть неотрицательными")
                return
            }
        }

        val num1 = inputNembers[0].split("")
        val num2 = inputNembers[1].split("")

        val intersectArr = num1.intersect(num2)

        println(intersectArr.joinToString(" "))
    } catch (e: NumberFormatException) {
        println("Ошибка! Введите числа")
    }

}