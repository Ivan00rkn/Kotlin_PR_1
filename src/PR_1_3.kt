/*5. Найдите первый символ в первом самом коротком слове
в строке снечетным числом символов
(в строке указываются только слова, разделенные одним или несколькими пробелами).*/

fun main(args: Array<String>) {
    val input = readLine()
    var word = ""
    var resultChar = ' '
    var len = 0
    var i = 0

    if (input !== null)
        for(letter in input){
            if(letter != ' '){
                word += letter
            }
            if(letter == ' ' || letter == input[input.length - 1]){
                if(word.length % 2 != 0){
                    println(i)
                    if(i == 0) len = word.length
                    if(len > word.length){
                        println("len $len")
                        len = word.length
                        resultChar = word[0]
                    }
                }
                i++
                word = ""
            }
        }

    println("First letter in the longest word with odd amount of letters is: $resultChar")
}
