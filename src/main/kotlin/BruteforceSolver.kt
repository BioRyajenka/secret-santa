class BruteforceSolver : ISolver {
    override fun solve(dudes: List<Dude>, bannedPairs: List<Pair<Dude, Dude>>): List<Pair<Dude, Dude>> {
        mainLoop@ while (true) {
            val solution = mutableListOf<Pair<Dude, Dude>>()
            val availableDudes = dudes.toMutableSet()
            for (santa in dudes) {
                val possibleGiftReceivers = availableDudes.filter {
                    it !== santa && it to santa !in solution
                            && santa to it !in bannedPairs && it to santa !in bannedPairs
                }
                if (possibleGiftReceivers.isEmpty()) {
                    println("Found ${solution.size} pairs before stuck. Retrying")
                    continue@mainLoop
                }
                val giftReceiver = possibleGiftReceivers.random()
                solution += santa to giftReceiver
                availableDudes -= giftReceiver
            }
            return solution
        }
    }
}
