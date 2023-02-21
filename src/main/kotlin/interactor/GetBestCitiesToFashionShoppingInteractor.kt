package interactor

import model.CityEntity
import utils.isPositive


class GetBestCitiesToFashionShoppingInteractor(private val dataSource: CostOfLivingDataSource) {

   operator fun invoke(limit: Int): List<String> {
        return dataSource.getAllCitiesData()
            .filter(::excludeNullAndNegativeClothesBrandPrices)
            .sortedBy { it.clothesPrices.getAverageBrandsPrices() }
            .take(limit)
            .map { it.cityName }
    }
    private fun excludeNullAndNegativeClothesBrandPrices(city: CityEntity): Boolean {
        return city.clothesPrices.run {
            oneSummerDressInAChainStoreZaraHAndM?.isPositive() ?: false &&
                    onePairOfNikeRunningShoesMidRange?.isPositive() ?: false &&
                    onePairOfJeansLevis50oneOrSimilar?.isPositive() ?: false
        }
    }
}