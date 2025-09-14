fun main() {
    val sword = Weapon("Меч", 25, 80, "Острое")
    val bow = Weapon("Лук", 15, 100, "Дальнобойное")

    sword.showInfo()
    bow.showInfo()

    println("Используем меч:")
    sword.use()
    sword.use()
    sword.use()

    println("\nУлучшаем лук:")
    bow.upgrade(10)
    bow.showInfo()

    println("Используем лук до поломки:")
    for (i in 1..12) {
        bow.use()
    }
}