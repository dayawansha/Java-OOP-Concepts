package accesmodifire2;
import DefaultA.*;

class X {
    void b() {
        System.out.println("default access within package");
    }
}
public class AccesModifire2 extends Defaule1 {

    public static void main(String[] args) {
        Defaule1 a = new Defaule1();   
      //  a.m();        // C.E 
        X x = new X();
       x.b();     
    }
}
