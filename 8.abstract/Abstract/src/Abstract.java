 abstract class Abstract1 {
    abstract void m();
    abstract void n();
    void x() {  System.out.print("x methode"); }
}

abstract class Abstract2 extends Abstract1 {
    @Override
    void n() {   System.out.println("n methode");   }
}

class Abstract3 extends Abstract2 {
    @Override
    void m() {  System.out.println("m methode"); }
   // abstract void x();       you have to put abstract key word befor class Abstract3 .
}

class Abstract {
    public static void main(String[] args) {
        Abstract2 A = new Abstract3();
        A.m();
    }
}
