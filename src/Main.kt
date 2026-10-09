// Задание 1
fun main() {
    val amount = 10000 // сумма
    var commission = amount * 0.75 / 100
    if (commission < 35) commission = 35.0
    println("Комиссия: $commission руб.")
    task2()
    task3()
}

// Задание 2
fun task2() {
    val likes = 31
    val word = if (likes % 10 == 1 && likes % 100 != 11) {
        "человеку"
    } else {
        "людям"
    }
    println("Понравилось $likes $word")
}

// Задание 3
fun task3() {
    val purchase = 15_000        // сумма покупки в рублях
    val isRegular = true         // постоянный ли покупатель

    // подсчет скидки
    val discount = if (purchase <= 1_000) {
        0.0
    } else if (purchase <= 10_000) {
        100.0
    } else {
        purchase * 0.05
    }

    // применение скидки
    var price = purchase - discount

    // применение скидки постоянного покупателя
    if (isRegular) {
        price *= 0.99
    }

    println("Итоговая цена: $price руб.")
}