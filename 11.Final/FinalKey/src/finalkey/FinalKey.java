package finalkey;

final class A {}

class B extends A {}


//////////////////////////////////////////////////////////////
class C {
    final void m() {}
}
class E extends C {
    void m() {
        System.out.print("m methode");
    }
}
///////////////////////////////////////////////////////////////
public class FinalKey {

    public static void main(String[] args) {
        final int a = 10;
        a = 0;
    }
}
