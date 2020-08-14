/*5. Найдите первый символ в первом самом коротком слове
в строке снечетным числом символов
(в строке указываются только слова, разделенные одним или несколькими пробелами).*/

fun main () {
    println("Введите слова через пробел")
    val input = readLine()
    if (input == "" || input == null) {
        println("Неверный ввод")
        return
    }
    val mustLongOddWord = input.split(" ").filter { it != "" }.fold("", {acc: String, word: String ->
        if (word.length % 2 != 0 && word.length > acc.length) word else acc
    })
    println(mustLongOddWord[0])
}
