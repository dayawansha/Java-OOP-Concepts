package acesmodifires;
class A {
    private int x = 10;
    private void m() {
        System.out.print("m methode in a class");
        A c = new A();
        c.m();
    }   
}
public class AcesModifires extends A {

    public static void main(String[] args) {
        A a = new A();
        AcesModifires b = new AcesModifires ();
        a.m();
        b.m();
        System.out.print(a.x);
        System.out.print(b.x);
    }

}
