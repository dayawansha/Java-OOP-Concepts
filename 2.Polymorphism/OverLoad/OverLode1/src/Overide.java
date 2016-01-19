
class Animal {
        void run(int a){
    System.out.println("animal run");
    }}
class Dog extends Animal {
        void run (){
        System.out.println("dog run");
        }
        void bark(){
         System.out.print("dog barks");
        }}
public class Overide {
    public static void main(String[] args) {
         Animal animals = new Animal();
         Dog dogs = new Dog();
       
         animals.run(10);
         dogs.run();
       
        Animal x = new Dog();
         x.run(10);
     //  x.bark();     mehide bark yanu super class akak  nowana nisa comrile error wey........
         
        new Dog().run();
    }
}
