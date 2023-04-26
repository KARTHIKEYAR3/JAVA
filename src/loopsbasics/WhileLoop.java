package loopsbasics;

public class WhileLoop {
	public static void main(String[] args) {
		int r =1;
		while(r <= 10){
			System.out.println("ivalue is"+ r);
			r++;
		}
	System.out.println("out of progress...********************************");
	
	
	//2nd method in while loop. but when we apply this(z++)keyword in 
	   //line of out print it will give 10 numbers but extend another one like 11
	int z =1;
	while(z <= 10){
		z++;
		System.out.println("ivalue is"+ z);
	}
	
	}
}

