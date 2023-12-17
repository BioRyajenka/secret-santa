
fun main() {
    val asya = Dude("Ася", "")
    val igor = Dude("Игорь", Wishes.IGOR)
    val lesha = Dude("Лёша", Wishes.LESHA)
    val ilyaBragin = Dude("Илья Брагин", Wishes.ILYA_BRAGIN)
    val katya = Dude("Катя", Wishes.KATYA)
    val ilyaKornienko = Dude("Илья Корниенко", "")
    val anya = Dude("Аня", "")

    val solution = BruteforceSolver().solve(
        listOf(asya, igor, lesha, ilyaBragin, katya, ilyaKornienko, anya),
        bannedPairs = listOf(
            asya to igor,
            ilyaBragin to katya,
            ilyaKornienko to anya
        )
    )

    solution.forEach { (santa, giftReceiver) ->
        println("${santa.name} -> ${giftReceiver.name}")
    }
}
