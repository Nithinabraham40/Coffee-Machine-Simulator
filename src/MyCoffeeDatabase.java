import java.util.ArrayList;
import java.util.HashMap;

public  class MyCoffeeDatabase {
	
	
	
	private HashMap<String,String>hm=new HashMap<>();
	
	private HashMap<String,Integer>ingredientsMap=new HashMap<>();
	
	private HashMap<CoffieeType,ArrayList<Integer>>coffeeTypeMap=new HashMap<>();
	
	private int moneyCollected;
	
	private int coffeeSold;
	
	
	
	
	
	
	
	
	
	
	public int getCoffeeSold() {
		return coffeeSold;
	}

	public void setCoffeeSold(int coffeeSold) {
		this.coffeeSold = coffeeSold;
	}

	public int getMoneyCollected() {
		return moneyCollected;
	}

	public void setMoneyCollected(int moneyCollected) {
		this.moneyCollected = moneyCollected;
	}

	public HashMap<CoffieeType, ArrayList<Integer>> getCoffeeTypeMap() {
		return coffeeTypeMap;
	}

	public void setCoffeeTypeMap() {
		
		ArrayList<Integer>capLs=new ArrayList<>();
		capLs.add(6);
		capLs.add(200);
		capLs.add(100);
		capLs.add(12);
		coffeeTypeMap.put(CoffieeType.CAPPUCCINO,capLs);
		ArrayList<Integer>latLs=new ArrayList<>();
		latLs.add(7);
		latLs.add(350);
		latLs.add(75);
		latLs.add(20);
		coffeeTypeMap.put(CoffieeType.LATTE,latLs);
		ArrayList<Integer>espLs=new ArrayList<>();
		espLs.add(4);
		espLs.add(250);
		espLs.add(0);
		espLs.add(16);
		coffeeTypeMap.put(CoffieeType.EXPRESSO,espLs);
	}

	public String addIngredients(int water,int beans,int milk ) {
		
		ingredientsMap.put("Water",water);
		ingredientsMap.put("Beans",beans);
		ingredientsMap.put("Milk",milk);
		
		return "ingredients added sucessfully";
		
	}
	
	public HashMap<String,Integer>getIngredients(){
		
		
		return ingredientsMap;
	}
	
     public void setIngredientsMap(HashMap<String,Integer>ingredientsMap){
    	 
    	 
		
		this.ingredientsMap=ingredientsMap;
	}
	

	public void savePassword(String password) {
		
		
		
		hm.put("password", password);
		
	}
	
	public String getPassword() {
		
	  return hm.get("password");
	}
	
	public String changePassword(String password) {
		
		
		
		hm.clear();
		hm.put("password", password);
		
		return "password changed";
		
	}
	
	public String viewCoffieTypeAvailable() {
		
		return "Click 1 for buy Espresso($4)\n"
			 + "Click 2 for buy Latte($7)\n"
			+  "Click 3 for buy Cappuccino($6)\n"
			+  "Click 0 for Main menu";	
		
		
	}

	
}
