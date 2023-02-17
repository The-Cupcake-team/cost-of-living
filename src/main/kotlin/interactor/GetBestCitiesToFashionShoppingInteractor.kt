package interactor

import model.CityEntity


class GetBestCitiesToFashionShoppingInteractor(private val dataSource: CostOfLivingDataSource) {

   operator fun invoke(limit: Int): List<String> {
        return dataSource.getAllCitiesData()
            .filter(::excludeNullClothesBrandPrices)
            .sortedBy { it.clothesPrices.getAverageBrandsPrices() }
            .take(limit)
            .map { it.cityName }
    }

    private fun excludeNullClothesBrandPrices(city: CityEntity): Boolean {
        return city.clothesPrices.run {
            oneSummerDressInAChainStoreZaraHAndM != null &&
            onePairOfNikeRunningShoesMidRange != null &&
            onePairOfJeansLevis50oneOrSimilar != null
        }
    }

}