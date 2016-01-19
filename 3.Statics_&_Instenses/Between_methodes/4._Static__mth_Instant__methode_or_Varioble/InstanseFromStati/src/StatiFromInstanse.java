public class StatiFromInstanse {
    String name = "Dushman";
   

    void run(){
    System.out.println("Instance methode");
    }
    
    public static void main(String[] args) {
        StatiFromInstanse A = new StatiFromInstanse();    //// static wala sita intense walata call kirima
        A.run();
        System.out.println(A.name);
        
    }
    
}
