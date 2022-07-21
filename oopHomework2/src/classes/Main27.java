package classes;

public class Main27 {
 
	public static void main(String[] args) {
		
		CustomerManager customerManager;
		CustomerManager customerManager2 = new CustomerManager();
		customerManager = customerManager2;
		
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();
		
		
		
	}
}


