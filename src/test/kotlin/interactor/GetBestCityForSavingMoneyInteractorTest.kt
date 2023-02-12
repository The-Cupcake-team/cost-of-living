package interactor

import dataSource.CsvDataSource
import dataSource.utils.CsvParser
import dataSource.utils.FakeDataProvider
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetBestCityForSavingMoneyInteractorTest {


    lateinit var bestCity: GetBestCityForSavingMoneyInteractor
    val csvParser = CsvParser()
    val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser)

    @BeforeAll
    fun setUp() {
        bestCity = GetBestCityForSavingMoneyInteractor(FakeDataProvider)
    }


    @Test
    fun should_ReturnTrue_When_TheCityHasNotNullRequireValues(){

        // given a city haven't null fields
        val cityWithoutNullFields = dataSource.getAllCitiesData()[4]

        // when check if the output is true
        val result = bestCity.checkNullFields(cityWithoutNullFields)
        val result2 = bestCity.checkNullFields(cityWithoutNullFields)
        // then check the result
        assertTrue(result && result2)
    }

    @Test
    fun should_ReturnFalse_When_TheCityHasNullRequireValues(){

        // given a city have null fields
        val cityWithNullFields = dataSource.getAllCitiesData()[1]

        // when check if the output is false
        val result = bestCity.checkNullFields(cityWithNullFields)
        val result2 = bestCity.checkNullFields(cityWithNullFields)
        // then check the result
        assertFalse(result && result2)
    }

    @Test
    fun should_ReturnTrue_When_WePassTheFakeData(){

        // Given a city name and the name of returned city
        val cityName = "Havana"
        val nameOfReturnedCity = bestCity.execute(true).cityName

        // when check if the two names are the same
        val areEqual = cityName == nameOfReturnedCity

        // then check the result
        assertTrue(areEqual)
    }

    @Test
    fun should_ReturnCity_When_WePassTheFakeData(){

        // Given a city name
        val cityName = "Havana"

        // when
        val nameOfReturnedCity = bestCity.execute(true).cityName

        // then check the result
        assertEquals(cityName , nameOfReturnedCity)
    }

    @Test
    fun should_ReturnFalse_When_WePassTheFakeData(){

        // Given a city name and the name of returned city
        val cityName = "Cairo"
        val nameOfReturnedCity = bestCity.execute(true).cityName

        // when check if the two names are the same
        val areEqual = cityName == nameOfReturnedCity

        // then check the result
        assertFalse(areEqual)
    }
}