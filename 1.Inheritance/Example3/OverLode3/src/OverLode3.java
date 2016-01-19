class Animal{
    void run(){
        System.out.println("run animal");
    }}
class Dog extends Animal{
    void run(){
        System.out.println("run dog");
    }}
class Bruna extends Dog{
    void run(){
        System.out.println("run bruna");
    }}

class Test{
    void testMethode (Animal a){
        System.out.println("m methode");
}
  Animal d(){                                //  meya awashya natha, class objact ona thanaka sadiya haki bawa penway.
        System.out.println("d methode");
        
        Animal a = new Animal();
        Dog b = new Dog();
        Dog c = new Bruna();
        Bruna d = new Bruna();
        return b ;    }    
}
public class OverLode3{
    
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog b = new Dog();
        Dog c = new Bruna();
        Bruna d = new Bruna();
      
    Test G = new Test();
        
        Dog x = G.d() ;
         G.testMethode(x);      
         G.testMethode(b);          //  void testMethode (Animal a){
         G.testMethode(c);          //   System.out.println("m methode");  }
         G.testMethode(d);
  }}
