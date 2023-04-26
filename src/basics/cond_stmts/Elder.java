package basics.cond_stmts;

public class Elder {
		 public static void main(String args[]){
				int marks=100;
				System.out.println("Enter total marks: ");
				
				
				if(marks<=100 && marks>=80){
					System.out.println("Congrats!!! First class:" + marks);
				}else if(marks<=79 && marks>=60){
					System.out.println("Seconds class:"  + marks);
				}else if(marks<=59 && marks>=40){
					System.out.println("Third class: " + marks);
				}else if(marks<=39 && marks>=0){
					System.out.println("Sorry!!! Failed:" + marks);
				}else{
					System.out.println("Invalid Marks entered....Try again");
				}
				
				System.out.println("\nEnd of prog...");
			}

	}


