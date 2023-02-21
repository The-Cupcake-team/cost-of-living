package interactor

import data.BestCityForFitnessManFakeData
import data.EmptyFakeData
import data.InvalidFakeData
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.function.Executable

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetBestCityForLivingToAFitnessManInteracterTest {
    private lateinit var getBestCityForLivingToAFitnessManInteracter: GetBestCityForLivingToAFitnessManInteracter


    @BeforeEach
    fun setup() {
        getBestCityForLivingToAFitnessManInteracter = GetBestCityForLivingToAFitnessManInteracter(BestCityForFitnessManFakeData)
    }


    @Test
    fun `should return correct city name when the data source is valid`() {
        //given a country and valid data
        val country = "USA"
        // when check and return city name
        val city = getBestCityForLivingToAFitnessManInteracter(country)
        // then asserted the return and the expected
        assertEquals("Chicago", city.cityName)
    }

    @Test
    fun `should throw an exception when the data source is invalid`() {
        getBestCityForLivingToAFitnessManInteracter = GetBestCityForLivingToAFitnessManInteracter(InvalidFakeData)
        //given a country and invalid data
        val country = "USA"
        // when check and return exception
        val result = Executable { getBestCityForLivingToAFitnessManInteracter(country) }
        // then asserted the return and the expected
        assertThrows(Exception::class.java, result)
    }

    @Test
    fun `should return empty when the data source is empty`() {
        getBestCityForLivingToAFitnessManInteracter = GetBestCityForLivingToAFitnessManInteracter(EmptyFakeData)
        //given a country and invalid data
        val country = "USA"
        // when check and return exception
        val result = Executable { getBestCityForLivingToAFitnessManInteracter(country) }
        // then asserted the return and the expected
        assertThrows(Exception::class.java, result)
    }

    @Test
    fun `should throw exception when the input is wrong`() {
        //given a wrong country
        val country = "5"
        // when check and return exception
        val result = Executable { getBestCityForLivingToAFitnessManInteracter(country) }
        // then asserted the return and the expected
        assertThrows(Exception::class.java, result)
    }

    @Test
    fun `should return correct city name when the country in lowercase`() {
        //given a country correct but in lowercase
        val country = "usa"
        // when check and return city name
        val city = getBestCityForLivingToAFitnessManInteracter(country)
        // then asserted the return and the expected
        assertEquals("Chicago", city.cityName)
    }

    @Test
    fun `should return correct city name when the country has outer space`() {
        //given a country correct but have outer space
        val country = "  usa   "
        // when check and return city name
        val city = getBestCityForLivingToAFitnessManInteracter(country)
        // then asserted the return and the expected
        assertEquals("Chicago", city.cityName)
    }

}