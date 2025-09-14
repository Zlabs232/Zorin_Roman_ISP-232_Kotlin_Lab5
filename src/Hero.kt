class Hero {
    var name: String = "Неизвестный"
    var gender: String = "Не указан"
    var role: String = "Бродяга"
    var hp: Int = 100
    var mp: Int = 50
    var level: Int = 1
    var element: String = "Обычный"

    fun sayHello() {
        println("Я — $name, мой путь только начинается!")
    }

    fun showStats() {
        println("Имя: $name | Класс: $role | HP: $hp | MP: $mp | Level: $level | Element: $element")
    }

    fun meditate() {
        println("$name медитирует...")
        mp += 20
        println("Мана восстановлена! Текущая мана: $mp")
    }

    fun takeDamage(damage: Int) {
        println("$name получает урон!")
        hp -= damage
        if (hp < 0) hp = 0
        println("Осталось здоровья: $hp")
    }

    fun greet(name: String) {
        println("Привет, $name!")
    }

    fun heal() {
        if (mp >= 10) {
            mp -= 10
            hp += 10
            if (hp > 100) hp = 100
            println("Лечусь! $name исцеляется на 10 HP. Здоровье: $hp, Мана: $mp")
        } else {
            println("Недостаточно маны для исцеления! У вас только $mp")
        }
    }

    fun castSpell() {
        if (mp >= 10) {
            mp -= 10
            println("$name применяет магию! Осталось маны: $mp")
        } else {
            println("Недостаточно маны для применения магии! У вас только $mp")
        }
    }

    fun attack(enemy: Enemy, damage: Int) {
        println("$name атакует врага ${enemy.name}!")
        enemy.takeDamage(damage)
    }

    fun castSpellOn(enemy: Enemy, spellName: String, damage: Int) {
        println("$name применяет заклинание '$spellName' на врага ${enemy.name}!")

        if(element == enemy.element){
            println("Стихии совпадают! Урон снижен")
            val finalDamage = damage / 2
            enemy.takeDamage(finalDamage)
        } else{
            enemy.takeDamage(damage)
        }
        mp -= 10
        if(mp < 0) mp = 0
        println("Осталось маны: $mp")
    }

    fun duel(opponent: Hero) {
        println("Дуэль между $name и ${opponent.name} начинается!")

        println("$name атакует первым!")
        opponent.takeDamage(15)

        println("${opponent.name} отвечает!")
        this.takeDamage(15)

        println("Дуэль завершена.")
        println("Состояние героев:")
        this.showStats()
        opponent.showStats()
    }
}