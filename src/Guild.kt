fun main() {
    val quest = Quest()

    print("Введите название квеста: ")
    val title = readln()
    print("Введите время выполнения (в часах): ")
    val duration = readln().toInt()
    print("Введите награду (в монетах): ")
    val reward = readln().toInt()
    print("Введите уровень сложности: ")
    val difficulty = readln()

    quest.title = title
    quest.duration = duration
    quest.reward = reward
    quest.difficulty = difficulty

    quest.printInfo()
}