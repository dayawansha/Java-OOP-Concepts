class A {
    void m(){
    System.out.println("A class");
    }
}
class B  A{
    void m (int x){
    System.out.println("B class");
    }
}
public class Overlode {
    public static void main(String[] args) {
        B b = new B();
        b.m(10);
        b.m();
    }}
