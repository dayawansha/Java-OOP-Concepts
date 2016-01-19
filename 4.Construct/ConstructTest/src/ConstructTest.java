public class ConstructTest {
    int age;
    String name;
    
    ConstructTest(){
        System.out.println("No parameeters");
    }
    
   ConstructTest(int age){
        System.out.println("int parameeters");
        }
    
    //ConstructTest(int age){} 
    
    ConstructTest(String name){}
    
    ConstructTest(String name,int age){}
    
    public static void main(String[] args) {
        ConstructTest a = new ConstructTest();
        ConstructTest b = new ConstructTest(10);
    }   
}
