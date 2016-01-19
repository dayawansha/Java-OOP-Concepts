class Parent{
    int age = 32;
    void run(){
        System.out.println(" run methode");
    }}
class Child extends Parent {


}

public class OppConceptsCls {
    
    public static void main(String[] args) {
     Parent A = new Parent();
     A.run();
    System.out.println( A.age);
     
     Child B = new Child();
     B.run();
     System.out.println( B.age);
    }  
}
