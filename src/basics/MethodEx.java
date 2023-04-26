package basics;

public class MethodEx {
	int x = 10, y = 20;
	 
	void add () {
		System.out.println("Addition result is   "+(x + y));
	}

	public static void main(String[] args) {
		MethodEx obj1 = new MethodEx();
		System.out.println("First variable: " + obj1.x);
		System.out.println("Second variable: " + obj1.y);
		obj1.add();
		
		System.out.println("********************************************");
		//Every object has its own independent memory
		//Any change in one memory will not reflect another memory(object)
		
	MethodEx obj2 = new MethodEx();
	obj2.x = 100;
	obj2.y = 200;
	System.out.println("First variable: " + obj2.x);
	System.out.println("Second variable: " + obj2.y);
	obj2.add();
	}
}
