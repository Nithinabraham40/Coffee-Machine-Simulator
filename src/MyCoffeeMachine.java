import java.util.ArrayList;
import java.util.HashMap;

public class MyCoffeeMachine extends CoffeeMachine {
	
	
	MyCoffeeDatabase db;
	
	
	public MyCoffeeMachine() {
		
		db=new MyCoffeeDatabase();
	}
	
	
	
	
	
	@Override
	public  String viewCoffeeTypeAvailable() {
		
		return db.viewCoffieTypeAvailable();
		
	
		
	}





	@Override
	public String buy(CoffieeType type) {
	
		
		HashMap<String,Integer>ingredientsPresent=db.getIngredients();
		
		db.setCoffeeTypeMap();
		 HashMap<CoffieeType, ArrayList<Integer>>map=db.getCoffeeTypeMap();
		
		 
		 ArrayList<Integer>ingredientsValue=map.get(type);
		 
		 if(ingredientsValue.get(1)>ingredientsPresent.get("Water")) {
			 
			 return "Insuffient Water";
		 }
       if(ingredientsValue.get(2)>ingredientsPresent.get("Milk")) {
			 
			 return "Insuffient Milk";
		 }
       if(ingredientsValue.get(3)>ingredientsPresent.get("Beans")) {
			 
			 return "Insuffient Beans";
		 }
       
       ingredientsPresent.put("Water",ingredientsPresent.get("Water")-ingredientsValue.get(1) );
       ingredientsPresent.put("Milk",ingredientsPresent.get("Milk")-ingredientsValue.get(2) );
       ingredientsPresent.put("Beans",ingredientsPresent.get("Beans")-ingredientsValue.get(3));
       
       db.setIngredientsMap(ingredientsPresent);
       int totalMoney=db.getMoneyCollected();
       totalMoney=totalMoney+map.get(type).get(0);
       db.setMoneyCollected(totalMoney);
       int sold=db.getCoffeeSold();
       sold=sold+1;
       db.setCoffeeSold(sold);
     
       
       return "Thank you for buying "+type+" pay $"+map.get(type).get(0) ;
       
		

	}





	@Override
	public HashMap<String,Integer> viewIngredientsLeft() {
	
		return db.getIngredients();
	}





	@Override
	public int getMoneyCollected() {
		
		
		
		
		return db.getMoneyCollected();
	}





	@Override
	public String addIngredients( int water, int beans, int milk) {
	return	db.addIngredients(water, beans, milk);
		
	}
	
	
	@Override
	public String analytics() {
		
		HashMap<String,Integer>map=db.getIngredients();
		
		return "Ingredients left:\n"
	    + "Water=" + map.get("Water") + "\n"
	    + "Milk=" + map.get("Milk") + "\n"
	    + "Beans=" + map.get("Beans") + "\n"
	    + "Today's Collection: $" + db.getMoneyCollected() + "\n"
	    + "Total coffee sold today: " + db.getCoffeeSold();
	
		
	}

}
