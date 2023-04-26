package basics.cond_stmts;

public class Switch_Ex {
    public static void main(String[] args) {
    
       int n =1;
       
       switch(n){
    	   
    	   case 1 : System.out.println("Sunday");
    	   break;
    	   
    	   case 2 : System.out.println("Monday");
    	   break;
    	   
    	   case 3 : System.out.println("Tuesday");
    	   break;
    	   
    	   case 4 : System.out.println("Wednesday");
    	   break;
    	   default:System.out.println("invalid");
    	   
       }
       
       System.out.println(" is the week");
 
	}
}


// it is to prove same value or no value in the block we have to use switch keyword