package interactor

import model.CityEntity

class GetBestCityForLivingToAFitnessManInteracter(private val dataSource: CostOfLivingDataSource) {
    operator fun invoke(countryName: String): CityEntity {
        return dataSource.getAllCitiesData()
            .filter {
                filterCountries(it, countryName) && excludeNullFoodsAndSalariesAndLowDataQuality(it)
            }
            .sortedBy(::calculateTheRatioBetweenFoodPriceAndSalary)
            .takeIf { it.isNotEmpty() }
            ?.first()
            ?: throw IllegalStateException("maybe you entered invalid country or something wrong in our server!")

    }

    private fun excludeNullFoodsAndSalariesAndLowDataQuality(city: CityEntity): Boolean {
        return checkIfNotNullFoodPrices(city) &&
                checkIfNotNullVegetablePrices(city) &&
                checkIfNotNullServicePrice(city) &&
                city.averageMonthlyNetSalaryAfterTax != null &&
                city.dataQuality
    }

    private fun checkIfNotNullVegetablePrices(city: CityEntity): Boolean {
        return with(city.fruitAndVegetablesPrices) {
            tomato1kg != null && potato1kg != null && onion1kg != null && lettuceOneHead != null
        }
    }

    private fun checkIfNotNullFoodPrices(city: CityEntity): Boolean {
        return with(city.foodPrices) {
            riceWhite1kg != null && eggsRegular12 != null && chickenFillets1kg != null
        }
    }

    private fun checkIfNotNullServicePrice(city: CityEntity): Boolean {
        return with(city.servicesPrices) {
            fitnessClubMonthlyFeeForOneAdult != null
        }
    }

    private fun calculateTheRatioBetweenFoodPriceAndSalary(city: CityEntity): Double {
        return (city.fruitAndVegetablesPrices.getAverageVegetablesPrice() + city.foodPrices.getAverageFoodPrices() + city.servicesPrices.fitnessClubMonthlyFeeForOneAdult!!) /
                city.averageMonthlyNetSalaryAfterTax!!
    }

    private fun filterCountries(city: CityEntity, countryName: String): Boolean {
        return city.country.equals(countryName.trim(), true)
    }

}
