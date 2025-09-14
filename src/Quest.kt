class Quest {
    var title: String = "Безымянное задание"
    var duration: Int = 1
    var reward: Int = 100
    var difficulty: String = "Лёгкий"

    fun printInfo(){
        println("Название квеста: ${this.title}")
        println("Время выполнения: ${this.duration} часов")
        println("Награда: ${this.reward} монет")
        println("Уровень сложности: ${this.difficulty}")
    }

    fun init(title: String, duration: Int, reward: Int, difficulty: String) {
        this.title = title
        this.duration = duration
        this.reward = reward
        this.difficulty = difficulty
    }
}