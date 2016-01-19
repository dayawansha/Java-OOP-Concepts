package chaning_4;
class A{
    A(){
    this("abc");
    System.out.println("A no parameeters");  
    }
    A (String x){
    super();
    System.out.println("A string parameeter");
    }
}
class B extends A{
    B(){
    super();
    }
}
public class Chaning_4 { 
    public static void main(String[] args) {
       B b = new B();
       
    }}
