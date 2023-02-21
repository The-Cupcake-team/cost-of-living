package interactor

import model.CityEntity

class SearchForSalariesInCountryCities(private val dataSource: CostOfLivingDataSource) {

    operator fun invoke(country: String): List<Pair<String, Float>> {
        return dataSource
            .getAllCitiesData()
            .filter { excludeNullSalariesAndLowDataQuality(it) && isLocatedInCountry(it, country) }
            .map { it.cityName to it.averageMonthlyNetSalaryAfterTax!! }
            .takeIf { it.isNotEmpty() } ?: throw IllegalArgumentException("Invalid country name.")
    }


    private fun excludeNullSalariesAndLowDataQuality(city: CityEntity) =
        city.averageMonthlyNetSalaryAfterTax != null && city.dataQuality

    private fun isLocatedInCountry(city: CityEntity, country: String) =
        city.country.equals(country, ignoreCase = true)


}