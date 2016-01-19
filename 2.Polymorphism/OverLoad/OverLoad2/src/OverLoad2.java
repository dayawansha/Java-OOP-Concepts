class A{
    int m(){
    System.out.println("A class");
    return 10;
    }
}
class B extends A{
    void m(int a){    //  mehidi return type pamanak wnas kirimen overload nowe... "void m( int a)" lesa dunna vita compile wey.
    System.out.println("B class");
    }
}
public class OverLoad2 {
    public static void main(String[] args) {
     A a = new A();
     B b = new B();
     a.m();
     b.m();
     b.m(10);
    } }
