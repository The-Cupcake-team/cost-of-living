package interactor

import data.BestCityForSavingMoneyFakeData
import data.EmptyFakeData
import model.CityEntity
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.function.Executable

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetBestCityForSavingMoneyInteractorTest {

    // region init
    private lateinit var bestCityForSavingMoney: GetBestCityForSavingMoneyInteractor

    @BeforeAll
    fun setup() {

        bestCityForSavingMoney =
            GetBestCityForSavingMoneyInteractor(BestCityForSavingMoneyFakeData)
    }
    // endregion

    @Test
    fun `should return true when the city has not null require values`() {

        // given
        val data = BestCityForSavingMoneyFakeData.getAllCitiesData()[0]
        val excludeNullRequireValues =
            bestCityForSavingMoney::class.java.getDeclaredMethod(
                "excludeNullRequireValues",
                CityEntity::class.java
            )
        excludeNullRequireValues.isAccessible = true

        // when check if the output is true
        val result = excludeNullRequireValues.invoke(bestCityForSavingMoney, data) as Boolean

        // then check the result
        assertTrue(result)
    }

    @Test
    fun `should return best city when we pass the fake data`() {

        // Given a city name and the name of returned city
        val bestThreeCitiesNames = BestCityForSavingMoneyFakeData.getAllCitiesData()[0]

        // when check if the two names are the same
        val namesOfReturnedCities = bestCityForSavingMoney()

        // then check the result
        assertEquals(bestThreeCitiesNames,namesOfReturnedCities)
    }

    @Test
    fun `should throw exception when the data is empty`() {

        // change data source to empty data
        bestCityForSavingMoney =
            GetBestCityForSavingMoneyInteractor(EmptyFakeData)

        // when the function throw exception

        val result = Executable {
            bestCityForSavingMoney()
        }

        // then check the result
        assertThrows(Exception::class.java, result)
    }

}