class Person{
    String name = "Dushman";
    static int numbers = 20;

    static void run(){
    System.out.println("Instance methode");
    }}

public class IntenseFromStatic {
    
    void PrintMothede() {  //////////////////////   meya adala wey
    Person.run();
    System.out.println(Person.numbers);
    }

    public static void main(String[] args) {
        IntenseFromStatic A = new IntenseFromStatic();
        A.PrintMothede();
        
    }  
}
