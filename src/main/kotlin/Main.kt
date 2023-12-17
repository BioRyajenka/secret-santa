
fun main() {
    val asya = Dude("Ася", "")
    val igor = Dude("Игорь", IGOR_WISHES)
    val lesha = Dude("Лёша", "")
    val ilyaBragin = Dude("Илья Брагин", ILYA_BRAGIN_WISHES)
    val katya = Dude("Катя", "")
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
