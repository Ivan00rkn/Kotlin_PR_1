/*5. Найдите первый символ в первом самом коротком слове
в строке снечетным числом символов
(в строке указываются только слова, разделенные одним или несколькими пробелами).*/

fun main(args: Array<String>) {
    println("Введите строку")

    val input: String? = readLine()
    var word = ""
    var resultChar = ' '
    var length = 0
    var i = 0

    if (input !== null)
        for (letter in input) {
            if (letter != ' ') {
                word += letter
            }
            if (letter == ' ' || letter == input[input.length - 1]) {
                if (word.length % 2 != 0) {
                    if (length > word.length || length == 0) {
                        length = word.length
                        resultChar = word[0]
                    }
                }

                word = ""
            }
        } else println("Ошибка ввода")

    if (resultChar != ' ') println("Результат: $resultChar") else println("Нет ни одного слова с нечётным количеством символов")

}
