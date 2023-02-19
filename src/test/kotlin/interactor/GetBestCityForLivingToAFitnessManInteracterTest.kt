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
        //given
        val country = "USA"
        // when check and return city name
        val city = getBestCityForLivingToAFitnessManInteracter(country)
        // then
        assertEquals("Santa Clara", city.cityName)
    }

    @Test
    fun `should throw an exception when the data source is invalid`() {
        getBestCityForLivingToAFitnessManInteracter = GetBestCityForLivingToAFitnessManInteracter(InvalidFakeData)
        //given
        val country = "USA"
        // when
        val result = Executable { getBestCityForLivingToAFitnessManInteracter(country) }
        // then
        assertThrows(Exception::class.java, result)
    }

    @Test
    fun `should return empty when the data source is empty`() {
        getBestCityForLivingToAFitnessManInteracter = GetBestCityForLivingToAFitnessManInteracter(EmptyFakeData)
        //given
        val country = "USA"
        // when
        val result = Executable { getBestCityForLivingToAFitnessManInteracter(country) }
        // then
        assertThrows(Exception::class.java, result)
    }

    @Test
    fun `should throw exception when the input is wrong`() {
        //given
        val country = "5"
        // when
        val result = Executable { getBestCityForLivingToAFitnessManInteracter(country) }
        // then
        assertThrows(Exception::class.java, result)
    }

    @Test
    fun `should return correct city name when the country in lowercase`() {
        //given
        val country = "usa"
        // when check and return city name
        val city = getBestCityForLivingToAFitnessManInteracter(country)
        // then
        assertEquals("Santa Clara", city.cityName)
    }

    @Test
    fun `should return correct city name when the country has outer space`() {
        //given
        val country = "  usa   "
        // when check and return city name
        val city = getBestCityForLivingToAFitnessManInteracter(country)
        // then
        assertEquals("Santa Clara", city.cityName)
    }

}