package interactor

import model.CityEntity

class GetBestCityForLivingToAFitnessManInteracter(private val dataSource: CostOfLivingDataSource) {
     operator fun invoke(countryName: String): CityEntity {
        return dataSource.getAllCitiesData()
            .filter {
                it.country.equals(countryName.trim(),true)  && excludeNullFoodsAndSalariesAndLowDataQuality(it)
            }
            .sortedBy(::calculateTheRatioBetweenFoodPriceAndSalary)
            .takeIf { it.isNotEmpty() }
            ?.first()
            ?: throw IllegalStateException("maybe you entered invalid country or something wrong in our server!")

    }

    private fun excludeNullFoodsAndSalariesAndLowDataQuality(city: CityEntity) =
        checkIfNotNullFoodPrices(city) && checkIfNotNullVegetablePrices(city) &&
                city.averageMonthlyNetSalaryAfterTax != null && city.dataQuality

    private fun checkIfNotNullVegetablePrices(city: CityEntity) =
        with(city.fruitAndVegetablesPrices) {
            tomato1kg != null && potato1kg != null && onion1kg != null && lettuceOneHead != null
        }

    private fun checkIfNotNullFoodPrices(city: CityEntity) =
        with(city.foodPrices) {
            riceWhite1kg != null && eggsRegular12 != null && chickenFillets1kg != null
        }

    private fun calculateTheRatioBetweenFoodPriceAndSalary(city: CityEntity) =
        (city.fruitAndVegetablesPrices.getAverageVegetablesPrice() + city.foodPrices.getAverageFoodPrices()) /
                city.averageMonthlyNetSalaryAfterTax!!
}
