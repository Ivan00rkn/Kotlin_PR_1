@file:Suppress("DEPRECATED_IDENTITY_EQUALS")
/* 5. В строке указано несколько неотрицательных целых чисел,
разделенных пробелами (по одному пробелу между числами).
Какие цифры присутствуют ровно в двух числах? */

fun main () {
    println("Введите неотрицательные числа через пробел")
    val input: String? = readLine()
    val numbers: Array<Int> = Array(size = 10) {0}
    var uniqueNumbers: Array<Int> = Array(size = 10) {0}
    var indexedNumber: Int = 0

    if (input == null || input == "") {
        println("Ошибка! Введите числа через пробел")
        return
    }

    for (char: Char in input) {
        if (char != ' ') {
            uniqueNumbers[char.toInt() - '0'.toInt()]++
            if (uniqueNumbers[char.toInt() - '0'.toInt()] == 1) numbers[char.toInt() - '0'.toInt()]++
        }
        if (char == ' ') uniqueNumbers = Array(size = 10) {0}
    }

    for (quantity in numbers) {
        if (quantity == 2) println(indexedNumber)
        indexedNumber ++
    }
}