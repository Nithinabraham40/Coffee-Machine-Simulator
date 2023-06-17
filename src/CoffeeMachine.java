import java.util.HashMap;

public abstract class CoffeeMachine {
	
	private String password;
	private CoffieeType type;
	private int price;
	private int water;
	private int milk;
	private int beans;
	
	
	public CoffeeMachine() {
		
	}
	
	public CoffeeMachine(String password) {
		
		this.password=password;
		
	}
	
	public CoffeeMachine(CoffieeType type,int price,int water,int milk,int beans) {
		this.type=type;
		this.price=price;
		this.water=water;
		this.milk=milk;
		this.beans=beans;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public CoffieeType getType() {
		return type;
	}

	public void setType(CoffieeType type) {
		this.type = type;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getWater() {
		return water;
	}

	public void setWater(int water) {
		this.water = water;
	}

	public int getMilk() {
		return milk;
	}

	public void setMilk(int milk) {
		this.milk = milk;
	}

	
	public int getBeans() {
		return beans;
	}

	public void setBeans(int beans) {
		this.beans = beans;
	}
	
	public abstract String buy(CoffieeType type);
	
	public abstract String viewCoffeeTypeAvailable();
	
	public abstract HashMap<String,Integer> viewIngredientsLeft();
	public abstract int getMoneyCollected();
	public abstract String addIngredients(int water,int beans,int milk);
	
	public abstract String analytics();
	
	
	
	
	
	

}
