package loopsbasics;

public class NestedLoop {
	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++){		
			for(int j=1;j<=11;j++){
				int k=i*j;
				System.out.println(i+"*"+j+"="+k);
				
			}
			System.out.println("loop completed");
		}
		
		
	}

}
//1st loop satisfi and it enter into 2nd loop then upto its break it will contiu 
 //upto 11