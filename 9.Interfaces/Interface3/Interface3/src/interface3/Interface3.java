package interface3;
interface A { void a();}

interface B { void b();}

class P {}

interface C extends A,B{  }

class Q{}

interface E { void e(); }

 class Interface3 extends Q implements C, E{
    public void a(){System.out.println("a methode");}
    public void b(){System.out.println("b methode");}
    public void c(){System.out.println("c methode");}
    public void e(){System.out.println("e methode");}
    
      
    public static void main(String[] args) {
        Interface3  test = new Interface3();
        test.a();
        test.b();
        test.c();
        test.e();         
}}
