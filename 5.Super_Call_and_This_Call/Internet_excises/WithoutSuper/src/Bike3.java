class Vehicle{  
  int speed=50;  
}   
public class Bike3 extends Vehicle {
int speed=100;  
      
  void display(){  
   System.out.println(speed);//will print speed of Bike   
  }  
    
    public static void main(String[] args) {
    Bike3 b  = new Bike3();  
    b.display(); 
    }    
}
