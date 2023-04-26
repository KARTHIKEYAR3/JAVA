
package loopsbasics;

public class Nestedloops {
public static void main(String[] args) {
	
	for(int x=100; x<=200;x++){
	for(int h=101; h<=200;h++) {
		int k=x*h;
		System.out.println(x+"*"+h+"="+k);
	}
	}
	System.out.println("loop complted.............................");
}
}
