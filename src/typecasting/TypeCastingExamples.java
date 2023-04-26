package typecasting;
//converting from one datatype to another datatype
public class TypeCastingExamples {
	public static void main(String[] args) {
		String values="10";

		
	// type-casting string to integer
   int r1 = Integer.parseInt(values);
   System.out.println("Result is: "+(r1+values));
   
  // type-casting string to float
   float r2 = Float.parseFloat(values);
   System.out.println("Result is: "+(r2));
   
    // type-casting string to boolean
   boolean r3 =Boolean.parseBoolean("10");   //default value is false not given any value
   System.out.println("Result is: "+(r3));
   
     // type-casting integer to string
      int a = 130;
     String r4 =Integer.toString(a);     //<<<<<<<we should use to string here 
     System.out.println("Result is: "+(r4));
     
     
     int z =200;
     String r5 =Integer.toString(z);
     System.out.println("Result is: "+(r5+50));
     System.out.println(z+50);
     
    
	}

}
