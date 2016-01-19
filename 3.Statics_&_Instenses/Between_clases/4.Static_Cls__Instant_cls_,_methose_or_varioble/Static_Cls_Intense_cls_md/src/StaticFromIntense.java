class Person{
    String name = "Dushman";
    
     void d(){
        System.out.println("Static aaa methode");
    }}

public class StaticFromIntense {
   
    public static void main(String[] args) { 
      Person A = new Person();
      A.d();
        System.out.println(A.name);
      
    } 
}

