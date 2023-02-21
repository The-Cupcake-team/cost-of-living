package interactor

import data.*
import model.CityEntity
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance
import kotlin.test.assertEquals

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetBestCitiesToFashionShoppingInteractorTest {

    private lateinit var bestCitiesToFashionShopping: GetBestCitiesToFashionShoppingInteractor

    @BeforeAll
    fun setUp() {
        bestCitiesToFashionShopping = GetBestCitiesToFashionShoppingInteractor(FashionShoppingFakeData)
    }

    @Test
    fun `should return 5 best cities to shopping when data include 5 cities full data valid`() {
        // given data with full data valid
        bestCitiesToFashionShopping = GetBestCitiesToFashionShoppingInteractor(FashionShoppingFakeData)
        val expectedResult = listOf("Damanhur", "cairo", "Pearl City", "Keller", "Malden")

        // when find 5 best cities to fashion shopping
        val result = bestCitiesToFashionShopping(5)

        // then check the result
        assertEquals(expectedResult, result)
    }

    @Test
    fun `should return empty list When all data give clothes prices null`() {
        // given data with clothes prices null
        bestCitiesToFashionShopping = GetBestCitiesToFashionShoppingInteractor(InvalidFakeData)
        val expected = emptyList<String>()

        // when find 5 best cities to fashion shopping
        val result = bestCitiesToFashionShopping(5)

        // then check the result
        assertEquals(expected, result)
    }

    @Test
    fun `should return empty list When give empty list`() {
        // given data empty list
        bestCitiesToFashionShopping = GetBestCitiesToFashionShoppingInteractor(EmptyFakeData)
        val expected = emptyList<String>()

        // when find 5 best cities to fashion shopping
        val result = bestCitiesToFashionShopping(5)

        // then check the result
        assertEquals(expected, result)
    }


    @Test
    fun `should return false when the city has not null require values`() {

        // given
        val data = InvalidFakeData.getAllCitiesData().first()
        val excludeNullAndNegativeClothesBrandPrices =
            GetBestCitiesToFashionShoppingInteractor::class.java.getDeclaredMethod(
                "excludeNullAndNegativeClothesBrandPrices", CityEntity::class.java
            )
        excludeNullAndNegativeClothesBrandPrices.isAccessible = true

        // when check if the output is false
        val result = excludeNullAndNegativeClothesBrandPrices.invoke(bestCitiesToFashionShopping, data) as Boolean

        // then check the result
        assertFalse(result)
    }

    @Test
    fun `should return ture when the city filed clothes brand prices not null`() {

        // given
        val data = FashionShoppingFakeData.getAllCitiesData().first()
        val excludeNullAndNegativeClothesBrandPrices =
            GetBestCitiesToFashionShoppingInteractor::class.java.getDeclaredMethod(
                "excludeNullAndNegativeClothesBrandPrices", CityEntity::class.java
            )
        excludeNullAndNegativeClothesBrandPrices.isAccessible = true

        // when check if the output is true
        val result = excludeNullAndNegativeClothesBrandPrices.invoke(bestCitiesToFashionShopping, data) as Boolean

        // then check the result
        assertTrue(result)
    }

}