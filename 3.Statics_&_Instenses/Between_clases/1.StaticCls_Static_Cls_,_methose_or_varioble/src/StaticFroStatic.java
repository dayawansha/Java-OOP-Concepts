class Person{
    
    static int numbers = 25;
    
    static void d(){
    System.out.println("Static methode");
    }}

public class StaticFroStatic {
    
    public static void main(String[] args) {
        
        System.out.println( Person.numbers );          
        Person.d();      
       /* Person A = new Person();   //  static nowana methode akakata call karana wita  adala cls ake methode akak sadiya uthuya.
        A.run();    */      
}}
