interface ISolver {
    fun solve(dudes: List<Dude>, bannedPairs: List<Pair<Dude, Dude>>): List<Pair<Dude, Dude>>
}
