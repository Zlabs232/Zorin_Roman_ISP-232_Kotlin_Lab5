fun main(){
//    val chmo: Hero = Hero()
//    println("Имя: ${chmo.name} \nПол: ${chmo.gender} \nКласс: ${chmo.role}\nЗдоровье: ${chmo.hp}\nМана: ${chmo.mp}")
//
//    val chuhan = Hero()
//    chuhan.name = "Чухан "
//    chuhan.gender = "Мужской"
//    chuhan.role = "Уборщик"
//    chuhan.hp = 120
//    chuhan.mp = 180
//    println("Имя: ${chuhan.name} \nПол: ${chuhan.gender} \nКласс: ${chuhan.role} \nЗдоровье: ${chuhan.hp} \nМана: ${chuhan.mp}")
//
//    val hero = Hero()
//    print("Введите имя героя: ")
//    hero.name = readln()
//    print("Введите пол героя: ")
//    hero.gender = readln()
//    print("Введите класс героя: ")
//    hero.role = readln()
//    print("Введите здоровье героя: ")
//    hero.hp = readln().toInt()
//    print("Введите ману героя: ")
//    hero.mp = readln().toInt()
//
//    println("Имя: ${hero.name} \nПол: ${hero.gender} \nКласс: ${hero.role} \nЗдоровье: ${hero.hp} \nМана: ${hero.mp}")

    val naruto = Hero()
    naruto.name = "Hapyтo"
    naruto.role = "Шиноби"
    naruto.element = "Ветер"
    naruto.mp = 100

    val kakashi = Hero()
    kakashi.name = "Какаши"
    kakashi.role = "Шиноби"
    kakashi.element = "Молния"
    kakashi.mp = 100

    val orochimaru = Enemy()
    orochimaru.name = "Орочинару"
    orochimaru.element = "Ветер"

    naruto.castSpellOn(enemy = orochimaru, spellName = "Расенган", damage = 30)
    naruto.duel(opponent = kakashi)
}