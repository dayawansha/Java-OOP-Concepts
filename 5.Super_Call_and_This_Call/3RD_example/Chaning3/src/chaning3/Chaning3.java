package chaning3;
class A {
    A(int x,int y){
     //   super();
        System.out.println("A class");      
}
}
class B extends A{
    B( ){
    super(2,3); 
     System.out.println("B class");//////////
    }
}


public class Chaning3 {
   
    public static void main(String[] args) {
        B b = new B();
       
    }
    
}
