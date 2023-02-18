package interactor

import data.CitiesAverageSalaryFakeData
import data.EmptyFakeData
import data.InvalidFakeData
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.function.Executable

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class SearchForSalariesInCountryCitiesTest {
    private lateinit var searchForSalariesInCountryCities: SearchForSalariesInCountryCities
    private lateinit var fakeData: CitiesAverageSalaryFakeData
    private lateinit var emptyList: EmptyFakeData
    private lateinit var invalidFakeData: InvalidFakeData


    @BeforeAll
    fun setUp() {
        emptyList = EmptyFakeData()
        fakeData = CitiesAverageSalaryFakeData()
        invalidFakeData = InvalidFakeData()

    }
    @Test
    fun `should return cities with average salary when input is lower case country name`() {
        //given a lower case country
        val country = "cuba"
        searchForSalariesInCountryCities = SearchForSalariesInCountryCities(fakeData)

        //when calculate the average salary of city
        val result = searchForSalariesInCountryCities(country)

        //then check the result
        val fakeList = listOf(Pair("Santa Clara", 25.0f))
        assertEquals(fakeList, result)
    }

    @Test
    fun `should return cities with average salary when input is upper case country name`() {
        //given an upper case country
        val country = "CUBA"
        searchForSalariesInCountryCities = SearchForSalariesInCountryCities(fakeData)

        //when calculate the average salary of city
        val result = searchForSalariesInCountryCities(country)

        //then check the result
        val fakeList = listOf(Pair("Santa Clara", 25.0f))
        assertEquals(fakeList, result)
    }

    @Test
    fun `should return cities with average salary when input is upper case and lower case country name`() {
        //given an upperCase and lowercase country name
        val country = "Cuba"
        searchForSalariesInCountryCities = SearchForSalariesInCountryCities(fakeData)

        //when calculate the average salary of city
        val result = searchForSalariesInCountryCities(country)

        //then check the result
        val fakeList = listOf(Pair("Santa Clara", 25.0f))
        assertEquals(fakeList, result)
    }

    @Test
    fun `should return correct cities when has high data quality`() {
        //given a country with high data quality
        val country = "cuba"
        searchForSalariesInCountryCities = SearchForSalariesInCountryCities(fakeData)

        //when return the average cities salary
        val result = searchForSalariesInCountryCities(country)

        //then check the result
        val fakeList = listOf(Pair("Santa Clara", 25.0f))
        assertEquals(fakeList, result)

    }

    @Test
    fun `should throw exception when the country name is wrong`() {
        //given an invalid name country
        val country = "AIZY"
        searchForSalariesInCountryCities = SearchForSalariesInCountryCities(fakeData)

        //when calculate the average salary of city
        val result = Executable { searchForSalariesInCountryCities(country) }

        //then check the result
        assertThrows(IllegalArgumentException::class.java, result)
    }

    @Test
    fun `should throw exception when entering spaces`() {
        //given an invalid name country
        val country = "    "
        searchForSalariesInCountryCities = SearchForSalariesInCountryCities(fakeData)

        //when calculate the average salary of city
        val result = Executable { searchForSalariesInCountryCities(country) }

        //then check the result
        assertThrows(IllegalArgumentException::class.java, result)
    }

    @Test
    fun `should throw exception when average salary is null`() {
        //given invalid country name
        val country = "japan"

        //when the salary is null
        searchForSalariesInCountryCities = SearchForSalariesInCountryCities(invalidFakeData)

        //then check the result
        val result = Executable { searchForSalariesInCountryCities(country) }
        assertThrows(IllegalArgumentException::class.java, result)
    }

    @Test
    fun `should throw exception when the data is empty`() {
        //given valid country name
        val country = "cuba"

        //when the data is empty
        searchForSalariesInCountryCities = SearchForSalariesInCountryCities(emptyList)

        //then check the result
        val result = Executable { searchForSalariesInCountryCities(country) }
        assertThrows(IllegalArgumentException::class.java, result)
    }
}

