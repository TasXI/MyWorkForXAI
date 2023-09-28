fun main() {
    while (true) {
        var password = ""
        val passwordElements = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"
        print("Введите размер пароля: ")
        val sizeOfPasswordString = readLine()
        if (sizeOfPasswordString != null) {
            for (n in 1..sizeOfPasswordString.toInt()) {
                password += passwordElements.random()
            }
        }
        println("Ваш пароль: $password")
    }
}