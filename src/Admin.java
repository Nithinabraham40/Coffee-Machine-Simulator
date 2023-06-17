
public class Admin {
	
	
	private MyCoffeeDatabase db;
	
	
	public Admin(MyCoffeeDatabase db) {
		
		this.db=db;
		
		db.savePassword("admin123");
		
	}
	
	

}
