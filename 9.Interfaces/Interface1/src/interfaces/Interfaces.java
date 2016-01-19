package interfaces;
interface A{
void a();
void b();
void c();
}
abstract class B implements A{
    public void c(){ System.out.println("c methode"); }
}
class M extends B{
    public void a(){ System.out.println("a methode"); }
    public void b(){ System.out.println("b methode"); }
    
}
public class Interfaces {
    public static void main(String[] args) {
        A X = new M();
        X.a();
        X.b();
        X.c();
    }
}
