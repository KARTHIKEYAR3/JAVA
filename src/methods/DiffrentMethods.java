package methods;

public class DiffrentMethods {
	
	//we can do methods how many we can do in class but we can't do same method in method
	//we should create another method in same class.
	
	
	static void addition() {
		
	int x =10, y = 50;
	System.out.println("Addition is: "+(x+y));
	}
	
	static void subraction() {
		
		int a =100, y = 200;
		System.out.println("subraction is:"+(a-y));
	}
	
	static void multipilcation() {
		
		int b= 120, c = 300;
		System.out.println("multipilcation is:"+(b*c));
	}
	
	static void divison() {
		
		int o = 20, u = 120;
		System.out.println("divison is:"+(o*u));
	}
	public static void main(String[] args) {
		System.out.println("statring progression......");
		addition();
	subraction();   // <<<<<<<<   //calling here to execute the programme here
	multipilcation();
	divison();
	
	
	
	
	}
	

}
