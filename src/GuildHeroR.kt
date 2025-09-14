fun main() {
    val guild = GuildHero()
    guild.name = "Мопсярки"

    val hero1 = Hero().apply {
        name = "Чмо"
        role = "Воин"
        level = 5
        hp = 120
        mp = 30
    }

    val hero2 = Hero().apply {
        name = "Чухан"
        role = "Маг"
        level = 8
        hp = 80
        mp = 100
    }

    val hero3 = Hero().apply {
        name = "Водолаз"
        role = "Лучник"
        level = 6
        hp = 90
        mp = 60
    }

    guild.addMember(hero1)
    guild.addMember(hero2)
    guild.addMember(hero3)

    guild.showMembers()
    guild.averageLevel()
}