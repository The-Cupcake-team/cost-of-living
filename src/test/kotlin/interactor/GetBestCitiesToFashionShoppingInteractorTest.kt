package interactor

import data.*
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance
import kotlin.test.assertEquals

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetBestCitiesToFashionShoppingInteractorTest {

    private lateinit var getBestCitiesToFashionShopping: GetBestCitiesToFashionShoppingInteractor

    private lateinit var fakeDataValid: FashionShoppingFakeData
    private lateinit var emptyFakeData: EmptyFakeData
    private lateinit var invalidFakeData: InvalidFakeData

    @BeforeAll
    fun setUp() {
        fakeDataValid = FashionShoppingFakeData()
        emptyFakeData = EmptyFakeData()
        invalidFakeData = InvalidFakeData()
    }

    @Test
    fun `should return 5 best cities to shopping when data include 5 cities full data valid`() {
        // given data with full data valid
        getBestCitiesToFashionShopping = GetBestCitiesToFashionShoppingInteractor(fakeDataValid)
        val expectedResult = listOf("Damanhur", "cairo", "Pearl City", "Keller", "Malden")

        // when find 5 best cities to fashion shopping
        val result = getBestCitiesToFashionShopping(5)

        // then check the result
        assertEquals(expectedResult, result)
    }
    @Test
    fun `should return empty list When all data give clothes prices null`() {
        // given data with clothes prices null
        getBestCitiesToFashionShopping = GetBestCitiesToFashionShoppingInteractor(invalidFakeData)
        val expected = emptyList<String>()

        // when find 5 best cities to fashion shopping
        val result = getBestCitiesToFashionShopping(5)

        // then check the result
        assertEquals(expected, result)
    }

    @Test
    fun `should return empty list When give empty list`() {
        // given data empty list
        getBestCitiesToFashionShopping = GetBestCitiesToFashionShoppingInteractor(emptyFakeData)
        val expected = emptyList<String>()

        // when find 5 best cities to fashion shopping
        val result = getBestCitiesToFashionShopping(5)

        // then check the result
        assertEquals(expected, result)
    }



}