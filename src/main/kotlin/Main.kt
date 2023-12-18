import java.io.File

fun main() {
    val asya = Dude("Ася", Wishes.ASYA)
    val igor = Dude("Игорь", Wishes.IGOR)
    val lesha = Dude("Лёша", Wishes.LESHA)
    val ilyaBragin = Dude("Илья Брагин", Wishes.ILYA_BRAGIN)
    val katya = Dude("Катя", Wishes.KATYA)
    val ilyaKornienko = Dude("Илья Корниенко", Wishes.ILYA_KORNIENKO)
    val anya = Dude("Аня", Wishes.ANYA)

    val solution = BruteforceSolver().solve(
        listOf(asya, igor, lesha, ilyaBragin, katya, ilyaKornienko, anya),
        bannedPairs = listOf(
            asya to igor,
            ilyaBragin to katya,
            ilyaKornienko to anya
        )
    )

    solution.forEach { (santa, giftReceiver) ->
        File("${santa.name}.txt").printWriter().use { out ->
            out.println("Твой подопечный: ${giftReceiver.name}\n\n" +
                    "Вот его пожелание:\n${giftReceiver.wishes}")
        }
    }
}
