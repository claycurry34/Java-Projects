package foodInfo;
import java.util.LinkedList;

public class FoodItem {
	private String name;
	private double servingSize;
	private LinkedList<FoodCategory> categories;
	private NutrientDensity nutrientDensity;
	public FoodItem()
	{
		name = "";
		servingSize = 0;
		servingSize = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getServingSize() {
		return servingSize;
	}

	public void setServingSize(double servingSize) {
		this.servingSize = servingSize;
	}

}

enum FoodCategory{
	Beef,
	Bread_Bakery,
	Candy, 
	Desert,
	Dairy_Eggs,
	Drinks,
	Fish,
	Food_cupboard,
	Fruits,
	Nuts,
	Pork,
	Poultry,
	ReadyMeals,
	Sauces,
	Soda,
	Soups,
	Snacks,
	Vegetables,
	Water;	
}