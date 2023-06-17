import java.util.HashMap;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		MyCoffeeDatabase db=new MyCoffeeDatabase();
		MyCoffeeMachine machine=new MyCoffeeMachine();
		
		
		
		Admin ad=new Admin(db);
		
		System.out.println("Welcome !!! Start your day with a coffee");
		
		System.out.println("Click 1 if yor are an Admin");
		System.out.println("Click 2 if you are a user");
		
		boolean status=false;
		int option=0;
		
		while(status==false) {
		
		 option=sc.nextInt();
		
		if(option<=0||option>2) {
			
			System.out.println("Click Valid option");
		}else {
			
			status=true;
		}
		
		
	}
		
		if(option==1) {
			
			boolean value=false;
			while(value==false) {
			System.out.println("Enter the password");
			
			String password=sc.next();
			if(password.equals(db.getPassword())) {
				value=true;
				
			}else {
				
				System.out.println("Wrong password");
				
			}
			
			
		}
			
			System.out.println("Click 1 for change password");
			System.out.println("Click 2 for view incredients");
			System.out.println("Click 3 for add incredients");
			System.out.println("Click 0 for main menu");
			
			int choice=-1;
			
			while(choice!=0) {
				
				choice=sc.nextInt();
				
				if(choice==1) {
					String password=sc.next();
					System.out.println(db.changePassword(password));
					
				}
				else if(choice==3) {
					
					System.out.println("Add Water");
					int water=sc.nextInt();
					System.out.println("add Beans");
					int beans=sc.nextInt();
					System.out.println("Add milk");
					int milk=sc.nextInt();
					
					System.out.println(machine.addIngredients(water, beans, milk));
					
				}
				
				else if(choice==2) {
					
					HashMap<String,Integer>map=machine.viewIngredientsLeft();
					for(String key:map.keySet()) {
						if(!key.equals("Beans"))
						System.out.println(key+" left="+map.get(key)+"ml");
						else {
					System.out.println(key+" left="+map.get(key)+"units");}
					}
				}
				else if(choice==0) {
					option=2;
					break;
				}
				
			}
				
			}
		
		if(option==2) {
			
			System.out.println("Click 1 for view coffeetype and price");
			System.out.println("Click 2 for money Collected" );
			System.out.println("Click 3 for analytic");
			System.out.println("Click 4 for Exit");
			
			
			boolean check=false;
			int n=1;
			
			
			while(check==false) {
				
				
				 n=sc.nextInt();
				if(n<1||n>4) {
					System.out.println("Enter the correct option ");
				}
				
				
			
			if(n==1) {
				
				System.out.println(db.viewCoffieTypeAvailable());
			
			int opt=1;
			
			while(opt>0&&opt<=3) {
				
				opt=sc.nextInt();
				if(opt==1) {
					
					System.out.println(machine.buy(CoffieeType.EXPRESSO));
					
					
				}if(opt==2) {
					
					System.out.println(machine.buy(CoffieeType.LATTE));
				}
				if(opt==3) {
					System.out.println(machine.buy(CoffieeType.CAPPUCCINO));
				}
				if(opt==0) {
					
					System.out.println("Click 1 for view coffeetype and price");
					System.out.println("Click 2 for money Collected" );
					System.out.println("Click 3 for analytic");
					System.out.println("Click 4 for Exit");
				}
				
			}
			
			}
			if(n==2) {
				System.out.println("Enter admin password");
				String savedPassword=db.getPassword();
				String password=sc.next();
				if(!savedPassword.equals(password)) {
					System.out.println("Authentication failed");
				}
				
				
				else {
					int money=machine.getMoneyCollected();
				System.out.println("Today's Collection is $"+money);}
			}
			
			if(n==3) {
				System.out.println(machine.analytics());
			}
			else if(n==4) {
				check=true;
			}
			
					
			
		
			
			
			
			
			
			
			
		}System.out.println("Thank you for using me");
			
			
		

}
	
	
}}
