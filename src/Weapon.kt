class Weapon(
    var name: String = "Оружие",
    var damage: Int = 10,
    var durability: Int = 100,
    var type: String = "Обычное"
) {
    fun showInfo() {
        println("=== Информация об оружии ===")
        println("Название: $name")
        println("Урон: $damage")
        println("Прочность: $durability")
        println("Тип: $type")
        println()
    }

    fun use() {
        if (durability <= 0) {
            println("$name сломано!")
            return
        }

        durability -= 10
        println("$name использовано. Осталось прочности: $durability")

        if (durability <= 0) {
            println("$name сломалось!")
            durability = 0
        }
    }

    fun upgrade(bonus: Int) {
        damage += bonus
        println("$name улучшено! Новый урон: $damage")
    }
}