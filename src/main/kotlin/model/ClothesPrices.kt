package model

data class ClothesPrices(
    val onePairOfJeansLevis50oneOrSimilar: Float?,
    val oneSummerDressInAChainStoreZaraHAndM: Float?,
    val onePairOfNikeRunningShoesMidRange: Float?,
    val onePairOfMenLeatherBusinessShoes: Float?,
){

     fun getAverageBrandsPrices(): Float {
        return listOfNotNull(
            onePairOfJeansLevis50oneOrSimilar,
            oneSummerDressInAChainStoreZaraHAndM,
            onePairOfNikeRunningShoesMidRange,
        ).average().toFloat()
    }

}
