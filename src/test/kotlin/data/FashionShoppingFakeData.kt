package data

import interactor.CostOfLivingDataSource
import model.*


class FashionShoppingFakeData : CostOfLivingDataSource {
    override fun getAllCitiesData(): List<CityEntity> {
        return listOf(

            CityEntity(
                cityName = "Santa Clara",
                country = "Cuba",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = 10.0f,
                    mealFor2PeopleMidRangeRestaurant = 30.0f,
                    mealAtMcDonaldSOrEquivalent = 5.0f
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = 1.91f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 2.0f,
                    waterAThirdOfLiterBottleInRestaurants = 0.5f,
                    milkRegularOneLiter = 3.52f,
                    waterOneAndHalfLiterBottleAtTheMarket = 0.98f
                ),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = 6.24f,
                    banana1kg = null,
                    oranges1kg = 1.12f,
                    tomato1kg = 1.0f,
                    potato1kg = 1.82f,
                    onion1kg = 2.0f,
                    lettuceOneHead = 0.86f
                ),
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = 1.0f,
                    riceWhite1kg = 1.0f,
                    eggsRegular12 = 1.64f,
                    localCheese1kg = 4.0f,
                    chickenFillets1kg = 6.07f,
                    beefRound1kgOrEquivalentBackLegRedMeat = 10.0f
                ),
                servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 11.5f,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.26f,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 80.0f,
                    fitnessClubMonthlyFeeForOneAdult = 6.0f,
                    tennisCourtRentOneHourOnWeekend = null,
                    cinemaInternationalReleaseOneSeat = 1.12f,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 70.0f,
                    internationalPrimarySchoolYearlyForOneChild = 15166.67f
                ),
                clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 55.5f,
                    oneSummerDressInAChainStoreZaraHAndM = 44.33f,
                    onePairOfNikeRunningShoesMidRange = 79.17f,
                    onePairOfMenLeatherBusinessShoes = 78.0f
                ),
                transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = 0.5f,
                    monthlyPassRegularPrice = null,
                    taxiStartNormalTariff = 1.0f,
                    taxi1kmNormalTariff = 0.5f,
                    taxi1hourWaitingNormalTariff = 15.0f,
                    gasolineOneLiter = 1.14f
                ),
                carsPrices = CarsPrices(
                    volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 80000.0f,
                    toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 81500.0f
                ),
                realEstatesPrices = RealEstatesPrices(
                    apartmentOneBedroomInCityCentre = null,
                    apartmentOneBedroomOutsideOfCentre = null,
                    apartment3BedroomsInCityCentre = null,
                    apartment3BedroomsOutsideOfCentre = null,
                    pricePerSquareMeterToBuyApartmentInCityCentre = null,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = null
                ),
                averageMonthlyNetSalaryAfterTax = 120.0f,
                dataQuality = false
            ),
            CityEntity(
                cityName = "Damanhur",
                country = "Egypt",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = 3.05f,
                    mealFor2PeopleMidRangeRestaurant = 23.4f,
                    mealAtMcDonaldSOrEquivalent = 4.07f,
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = 1.19f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 0.35f,
                    waterAThirdOfLiterBottleInRestaurants = 0.2f,
                    milkRegularOneLiter = 0.51f,
                    waterOneAndHalfLiterBottleAtTheMarket = 0.27f,
                ),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = 0.79f,
                    banana1kg = 0.61f,
                    oranges1kg = 0.41f,
                    tomato1kg = 0.24f,
                    potato1kg = 0.27f,
                    onion1kg = 0.18f,
                    lettuceOneHead = 0.09f
                ),
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = 0.54f,
                    riceWhite1kg = 0.52f,
                    eggsRegular12 = 0.98f,
                    localCheese1kg = 1.42f,
                    chickenFillets1kg = 2.92f,
                    beefRound1kgOrEquivalentBackLegRedMeat = 7.33f
                ),
                servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 47.48f,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.02f,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 12.21f,
                    fitnessClubMonthlyFeeForOneAdult = 16.28f,
                    tennisCourtRentOneHourOnWeekend = null,
                    cinemaInternationalReleaseOneSeat = 3.26f,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 40.7f,
                    internationalPrimarySchoolYearlyForOneChild = 915.7f
                ),
                clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 12.21f,
                    oneSummerDressInAChainStoreZaraHAndM = 10.17f,
                    onePairOfNikeRunningShoesMidRange = 122.09f,
                    onePairOfMenLeatherBusinessShoes = 24.42f
                ),
                transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = 0.08f,
                    monthlyPassRegularPrice = 8.14f,
                    taxiStartNormalTariff = 0.35f,
                    taxi1kmNormalTariff = 0.16f,
                    taxi1hourWaitingNormalTariff = 1.63f,
                    gasolineOneLiter = 0.36f
                ),
                carsPrices = CarsPrices(
                    volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 15261.71f,
                    toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 17296.61f
                ),
                realEstatesPrices = RealEstatesPrices(
                    apartmentOneBedroomInCityCentre = null,
                    apartmentOneBedroomOutsideOfCentre = null,
                    apartment3BedroomsInCityCentre = null,
                    apartment3BedroomsOutsideOfCentre = null,
                    pricePerSquareMeterToBuyApartmentInCityCentre = 1017.45f,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = 203.49f
                ),
                averageMonthlyNetSalaryAfterTax = 81.4f,
                dataQuality = true
            ),
            CityEntity(
                cityName = "cairo",
                country = "Egypt",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = 5.05f,
                    mealFor2PeopleMidRangeRestaurant = 23.4f,
                    mealAtMcDonaldSOrEquivalent = 6.07f
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = 7.19f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 8.35f,
                    waterAThirdOfLiterBottleInRestaurants = 0.2f,
                    milkRegularOneLiter = 0.51f,
                    waterOneAndHalfLiterBottleAtTheMarket = 0.27f
                ),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = 0.79f,
                    banana1kg = 0.61f,
                    oranges1kg = 0.41f,
                    tomato1kg = 0.24f,
                    potato1kg = 0.27f,
                    onion1kg = 0.18f,
                    lettuceOneHead = 0.09f
                ),
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = 0.54f,
                    riceWhite1kg = 0.52f,
                    eggsRegular12 = 0.98f,
                    localCheese1kg = 1.42f,
                    chickenFillets1kg = 2.92f,
                    beefRound1kgOrEquivalentBackLegRedMeat = 7.33f
                ),
                servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 47.48f,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.02f,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 52.21f,
                    fitnessClubMonthlyFeeForOneAdult = 16.28f,
                    tennisCourtRentOneHourOnWeekend = null,
                    cinemaInternationalReleaseOneSeat = 3.26f,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 40.7f,
                    internationalPrimarySchoolYearlyForOneChild = 915.7f
                ),
                clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 12.21f,
                    oneSummerDressInAChainStoreZaraHAndM = 10.17f,
                    onePairOfNikeRunningShoesMidRange = 122.09f,
                    onePairOfMenLeatherBusinessShoes = 24.42f
                ),
                transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = 0.08f,
                    monthlyPassRegularPrice = 8.14f,
                    taxiStartNormalTariff = 0.35f,
                    taxi1kmNormalTariff = 0.16f,
                    taxi1hourWaitingNormalTariff = 1.63f,
                    gasolineOneLiter = 0.36f
                ),
                carsPrices = CarsPrices(
                    volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 15261.71f,
                    toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 17296.61f
                ),
                realEstatesPrices = RealEstatesPrices(
                    apartmentOneBedroomInCityCentre = null,
                    apartmentOneBedroomOutsideOfCentre = null,
                    apartment3BedroomsInCityCentre = null,
                    apartment3BedroomsOutsideOfCentre = null,
                    pricePerSquareMeterToBuyApartmentInCityCentre = 1017.45f,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = 203.49f
                ),
                averageMonthlyNetSalaryAfterTax = 81.4f,
                dataQuality = true
            ),
            CityEntity(
                cityName = "Moncks Corner",
                country = "United States",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = 14.5f,
                    mealFor2PeopleMidRangeRestaurant = 40.0f,
                    mealAtMcDonaldSOrEquivalent = 7.5f
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = 4.33f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 1.0f,
                    waterAThirdOfLiterBottleInRestaurants = 1.0f,
                    milkRegularOneLiter = 0.91f,
                    waterOneAndHalfLiterBottleAtTheMarket = 1.75f
                ),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = 0.1f,
                    banana1kg = 0.1f,
                    oranges1kg = 0.1f,
                    tomato1kg = 0.1f,
                    potato1kg = 0.1f,
                    onion1kg = 0.1f,
                    lettuceOneHead = 0.1f
                ),
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = 2.2f,
                    riceWhite1kg = 2.62f,
                    eggsRegular12 = 2.17f,
                    localCheese1kg = 11.02f,
                    chickenFillets1kg = 8.8f,
                    beefRound1kgOrEquivalentBackLegRedMeat = 15.76f
                ),
                servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 144.92f,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.0f,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 67.78f,
                    fitnessClubMonthlyFeeForOneAdult = null,
                    tennisCourtRentOneHourOnWeekend = null,
                    cinemaInternationalReleaseOneSeat = 9.0f,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 1500.0f,
                    internationalPrimarySchoolYearlyForOneChild = null
                ),
                clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 52.0f,
                    oneSummerDressInAChainStoreZaraHAndM = 46.33f,
                    onePairOfNikeRunningShoesMidRange = 94.67f,
                    onePairOfMenLeatherBusinessShoes = 90.0f
                ),
                transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = null,
                    monthlyPassRegularPrice = null,
                    taxiStartNormalTariff = 2.1f,
                    taxi1kmNormalTariff = 1.49f,
                    taxi1hourWaitingNormalTariff = 15.0f,
                    gasolineOneLiter = 0.92f
                ),
                carsPrices = CarsPrices(
                    volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = null,
                    toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 28500.0f
                ),
                realEstatesPrices = RealEstatesPrices(
                    apartmentOneBedroomInCityCentre = 1000.0f,
                    apartmentOneBedroomOutsideOfCentre = 100.0f,
                    apartment3BedroomsInCityCentre = 1000.0f,
                    apartment3BedroomsOutsideOfCentre = 100.0f,
                    pricePerSquareMeterToBuyApartmentInCityCentre = null,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = null
                ),
                averageMonthlyNetSalaryAfterTax = 90000000.0f,
                dataQuality = false
            ),


            CityEntity(
                cityName = "Keller",
                country = "United States",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = 30.0f,
                    mealFor2PeopleMidRangeRestaurant = 75.0f,
                    mealAtMcDonaldSOrEquivalent = 7.5f
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = 5.33f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 1.8f,
                    waterAThirdOfLiterBottleInRestaurants = 1.17f,
                    milkRegularOneLiter = 0.88f,
                    waterOneAndHalfLiterBottleAtTheMarket = 3.0f
                ),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = 4.13f,
                    banana1kg = 1.33f,
                    oranges1kg = 5.75f,
                    tomato1kg = 6.03f,
                    potato1kg = 4.05f,
                    onion1kg = 3.36f,
                    lettuceOneHead = 1.59f
                ),
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = 2.84f,
                    riceWhite1kg = 3.98f,
                    eggsRegular12 = 3.0f,
                    localCheese1kg = 15.08f,
                    chickenFillets1kg = 7.61f,
                    beefRound1kgOrEquivalentBackLegRedMeat = 18.7f
                ),
                servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 210.09f,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = null,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 67.8f,
                    fitnessClubMonthlyFeeForOneAdult = 39.0f,
                    tennisCourtRentOneHourOnWeekend = null,
                    cinemaInternationalReleaseOneSeat = 9.5f,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 1125.0f,
                    internationalPrimarySchoolYearlyForOneChild = null
                ),
                clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 47.5f,
                    oneSummerDressInAChainStoreZaraHAndM = 26.0f,
                    onePairOfNikeRunningShoesMidRange = 92.5f,
                    onePairOfMenLeatherBusinessShoes = 200.0f
                ),
                transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = null,
                    monthlyPassRegularPrice = null,
                    taxiStartNormalTariff = 3.12f,
                    taxi1kmNormalTariff = 1.12f,
                    taxi1hourWaitingNormalTariff = 18.0f,
                    gasolineOneLiter = 0.99f
                ),
                carsPrices = CarsPrices(
                    volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 29880.0f,
                    toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 20425.0f
                ),
                realEstatesPrices = RealEstatesPrices(
                    apartmentOneBedroomInCityCentre = 1521.67f,
                    apartmentOneBedroomOutsideOfCentre = null,
                    apartment3BedroomsInCityCentre = 3200.0f,
                    apartment3BedroomsOutsideOfCentre = null,
                    pricePerSquareMeterToBuyApartmentInCityCentre = null,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = null
                ),
                averageMonthlyNetSalaryAfterTax = 13.5f,
                dataQuality = false
            ),


            CityEntity(
                cityName = "Malden",
                country = "United States",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = null,
                    mealFor2PeopleMidRangeRestaurant = null,
                    mealAtMcDonaldSOrEquivalent = 7.5f
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = 4.5f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = null,
                    waterAThirdOfLiterBottleInRestaurants = 2.0f,
                    milkRegularOneLiter = null,
                    waterOneAndHalfLiterBottleAtTheMarket = 1.33f
                ),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = 4.92f,
                    banana1kg = 2.0f,
                    oranges1kg = 6.61f,
                    tomato1kg = 5.51f,
                    potato1kg = 5.51f,
                    onion1kg = 4.4f,
                    lettuceOneHead = 2.03f
                ),
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = null,
                    riceWhite1kg = 6.17f,
                    eggsRegular12 = null,
                    localCheese1kg = 9.92f,
                    chickenFillets1kg = null,
                    beefRound1kgOrEquivalentBackLegRedMeat = null
                ),
                servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 221.47f,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = null,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 67.8f,
                    fitnessClubMonthlyFeeForOneAdult = null,
                    tennisCourtRentOneHourOnWeekend = null,
                    cinemaInternationalReleaseOneSeat = 12.0f,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = null,
                    internationalPrimarySchoolYearlyForOneChild = 5000.0f
                ),
                clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 51.66f,
                    oneSummerDressInAChainStoreZaraHAndM = 50.0f,
                    onePairOfNikeRunningShoesMidRange = 69.99f,
                    onePairOfMenLeatherBusinessShoes = 104.67f
                ),
                transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = 2.5f,
                    monthlyPassRegularPrice = 84.0f,
                    taxiStartNormalTariff = null,
                    taxi1kmNormalTariff = null,
                    taxi1hourWaitingNormalTariff = null,
                    gasolineOneLiter = null
                ),
                carsPrices = CarsPrices(
                    volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = null,
                    toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 20000.0f
                ),
                realEstatesPrices = RealEstatesPrices(
                    apartmentOneBedroomInCityCentre = null,
                    apartmentOneBedroomOutsideOfCentre = null,
                    apartment3BedroomsInCityCentre = null,
                    apartment3BedroomsOutsideOfCentre = null,
                    pricePerSquareMeterToBuyApartmentInCityCentre = 10763.91f,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = 6458.35f
                ),
                averageMonthlyNetSalaryAfterTax = 14.9f,
                dataQuality = false
            ),


            CityEntity(
                cityName = "Pearl City",
                country = "United States",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = null,
                    mealFor2PeopleMidRangeRestaurant = null,
                    mealAtMcDonaldSOrEquivalent = 10.0f
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = 5.25f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = null,
                    waterAThirdOfLiterBottleInRestaurants = 1.44f,
                    milkRegularOneLiter = 2.38f,
                    waterOneAndHalfLiterBottleAtTheMarket = 2.08f
                ),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = 5.91f,
                    banana1kg = 3.84f,
                    oranges1kg = 7.02f,
                    tomato1kg = 5.94f,
                    potato1kg = 4.95f,
                    onion1kg = 4.44f,
                    lettuceOneHead = 2.74f
                ),
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = 4.41f,
                    riceWhite1kg = 7.33f,
                    eggsRegular12 = null,
                    localCheese1kg = 12.13f,
                    chickenFillets1kg = null,
                    beefRound1kgOrEquivalentBackLegRedMeat = 26.46f
                ),
                servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 251.16f,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = null,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 68.12f,
                    fitnessClubMonthlyFeeForOneAdult = 60.0f,
                    tennisCourtRentOneHourOnWeekend = null,
                    cinemaInternationalReleaseOneSeat = null,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = null,
                    internationalPrimarySchoolYearlyForOneChild = null
                ),
                clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 47.55f,
                    oneSummerDressInAChainStoreZaraHAndM = 35.87f,
                    onePairOfNikeRunningShoesMidRange = 79.29f,
                    onePairOfMenLeatherBusinessShoes = null
                ),
                transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = null,
                    monthlyPassRegularPrice = null,
                    taxiStartNormalTariff = null,
                    taxi1kmNormalTariff = null,
                    taxi1hourWaitingNormalTariff = null,
                    gasolineOneLiter = null
                ),
                carsPrices = CarsPrices(
                    volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = null,
                    toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 21105.0f
                ),
                realEstatesPrices = RealEstatesPrices(
                    apartmentOneBedroomInCityCentre = 2000.0f,
                    apartmentOneBedroomOutsideOfCentre = 1750.0f,
                    apartment3BedroomsInCityCentre = 5000.0f,
                    apartment3BedroomsOutsideOfCentre = 4750.0f,
                    pricePerSquareMeterToBuyApartmentInCityCentre = null,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = null
                ),
                averageMonthlyNetSalaryAfterTax = 12.0f,
                dataQuality = false
            )
        )

    }
}








