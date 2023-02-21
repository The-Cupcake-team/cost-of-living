package interactor

import data.CostlierCityFakeData
import data.EmptyFakeData
import data.InvalidFakeData
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.function.Executable

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetCostlierCityInteractorTest {
    private lateinit var getCostlierCityInteractor:
            GetCostlierCityInteractor

    private lateinit var fakeDataSource: CostlierCityFakeData

    @BeforeAll
    fun setup() {
        fakeDataSource = CostlierCityFakeData()
    }

    @Test
    fun `should return correct city when the data is valid`() {
        getCostlierCityInteractor = GetCostlierCityInteractor(fakeDataSource)
        //when The result is one city
        val city = getCostlierCityInteractor.execute()
        //then check
        assertEquals("Seoul", city.cityName)
    }

    @Test
    fun `should return empty when the data is empty`() {
        getCostlierCityInteractor =
            GetCostlierCityInteractor(EmptyFakeData)
        //when The result is one city
        val result = Executable { getCostlierCityInteractor.execute() }
        //then check
        assertThrows(Exception::class.java, result)

    }

    @Test
    fun `should throw exception when the data is inValid`() {
        getCostlierCityInteractor =
            GetCostlierCityInteractor(InvalidFakeData)
        //when The result is one city
        val result = Executable { getCostlierCityInteractor.execute() }
        //then check
        assertThrows(Exception::class.java, result)
    }


}