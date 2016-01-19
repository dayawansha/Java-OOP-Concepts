class Test{
    String name = "dushman";
    
    void details(){
        System.out.println("instanse methode");
}}

public class ClsInstentFRClsInstance {
    
    void RunTeCls(){
    Test A = new Test();
        A.details();
        System.out.println(A.name); 
        
    }
    public static void main(String[] args) {
       ClsInstentFRClsInstance T = new  ClsInstentFRClsInstance ();
        T.RunTeCls();
    } }
