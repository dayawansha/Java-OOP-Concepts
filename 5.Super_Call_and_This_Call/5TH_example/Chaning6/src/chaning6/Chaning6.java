package chaning6;   ////   main resoin is,,  this aka magin constructors calle wana piliwela labadiya  haki wimay. 

public class Chaning6 {
    
   public Chaning6(){
        this(5,3,6);
         System.out.println("Default   (0) constructor");
   }
   public Chaning6(String str){
         this("Hello", 2);
    	 System.out.println("Parametrized constructor with 1 param");
   }
   public Chaning6(String str, int num){
           ///   this();                    meya thibuna hoth run time expection akak athiweyyy..............
    	 System.out.println("Parametrized constructor with 2 args");
   }
   public Chaning6(int num1, int num2, int num3){
   	
         this("Hello"); 
        System.out.println("Parametrized constructor with 3 args");
   }
   public static void main(String args[]){
            Chaning6 obj = new Chaning6();
   }
}

    
   
       
    
    