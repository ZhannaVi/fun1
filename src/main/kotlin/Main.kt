fun getUserChoice(): Int {
    println("Выберите действие:")
    println("1. Камень")
    println("2. Ножницы")
    println("3. Бумага")
    print("Введите номер выбора: ")
    return readLine()?.toIntOrNull() ?: getUserChoice()
}

fun getUserChoice2(): Int {
    println("Выберите действие:")
    println("1. Камень")
    println("2. Ножницы")
    println("3. Бумага")
    print("Введите номер выбора: ")
    return readLine()?.toIntOrNull() ?: getUserChoice2()
}


fun determineWinner(userChoice: Int,getUserChoice2: Int): String {
    return when {
        userChoice ==getUserChoice2 -> "Вы идорасы!"
        (userChoice == 1 && getUserChoice2 == 3) ||
                (userChoice == 2 && getUserChoice2== 1) ||
                (userChoice == 3 && getUserChoice2== 2) -> " победил 2!"
        else -> " победил 1!"
    }
}

fun main() {
    val userChoice = getUserChoice()
    val computerChoice = getUserChoice2()


    val result = determineWinner(userChoice, computerChoice)
    println(result)
}
