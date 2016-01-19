public class IntenseFromStatic {
    String name = "Dushman";
    static int numbers = 100;

    static void d(){
        System.out.println("Static methode");
    }
    
    void test() {
        d();    //////   intence thula sita static ayata calle caray   
        System.out.println( numbers );
    }
    
    public static void main(String[] args) {
        IntenseFromStatic A = new IntenseFromStatic();
        A.test();
    } }
