package Package;

public class Test1 {
    
    protected void m() {
        System.out.println("m methode");
  //  protected double x = 43;
    }
}
   class Test2 {
        void n() {
            System.out.println("n methode");
            
        Test1 H = new Test1();
        H.m();
        
        
        
        
    }
}
 