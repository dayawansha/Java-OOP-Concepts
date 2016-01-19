package accessmodifire3;

import Package.Test1;

class B extends Test1 {

    void x() {
        B L = new B();
        L.m();     //  C.E
        
        Test1 u = new Test1();
        u.m();
    }
}
public class AccessModifire3 extends Test1 {
    public static void main(String[] args) {
        AccessModifire3 A = new AccessModifire3();
        A.m();

        Test1 t = new Test1();
        t.m();  //  C.E
        
        AccessModifire3 M = new AccessModifire3();
        M.m();
        
    }

}
