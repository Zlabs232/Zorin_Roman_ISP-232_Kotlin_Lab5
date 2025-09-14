class GuildHero {
    var name: String = "Гильдия"
    var members: MutableList<Hero> = mutableListOf()

    fun addMember(hero: Hero) {
        members.add(hero)
        println("Герой ${hero.name} присоединился к гильдии $name!")
    }

    fun showMembers() {
        println("=== Члены гильдии $name ===")
        if (members.isEmpty()) {
            println("В гильдии пока нет членов")
        } else {
            for (hero in members) {
                hero.showStats()
            }
        }
        println()
    }

    fun averageLevel() {
        val totalLevel = members.sumOf { it.level }
        val average = totalLevel.toDouble() / members.size
        println("Средний уровень гильдии $name: ${"%.1f".format(average)}")
    }
}