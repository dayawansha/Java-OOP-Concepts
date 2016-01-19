class Animals{
    void run(){
        System.out.println("animal run");
    }}
class Dog extends Animals{
    void run(){
        System.out.println("Dog run");
    }}
class Cat extends Animals{
 void run(){
        System.out.println("Cat run");
    }}
class Lion extends Animals{
     void run(){
        System.out.println("Lion run");
    }}
class Dalmetion extends Animals{
 void run(){
        System.out.println("Dalmetion dog run");
    }}
public class InheriMetodeOverite {
    public static void main(String[] args) {
        Animals A = new Animals();
        Dog B = new Dog();
        Cat C = new Cat();
        Lion D = new Lion();
        A.run();
        B.run();
        C.run();
        D.run(); 
    } 
}
