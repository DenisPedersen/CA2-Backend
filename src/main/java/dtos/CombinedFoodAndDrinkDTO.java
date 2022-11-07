package dtos;

public class CombinedFoodAndDrinkDTO {


    private FoodDTO foodDTO;
    private DrinkDTO drinkDTO;

    public CombinedFoodAndDrinkDTO(FoodDTO foodDTO, DrinkDTO drinkDTO) {
        this.foodDTO = foodDTO;
        this.drinkDTO = drinkDTO;
    }

    @Override
    public String toString() {
        return "CombinedFoodAndDrinkDTO{" +
                "foodDTO=" + foodDTO +
                ", drinkDTO=" + drinkDTO +
                '}';
    }
}
