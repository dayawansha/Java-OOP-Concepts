public class ConstOverlode { 
    String name;  
    int age;
    ConstOverlode(int i,String n){  
    age = i;  
    name = n; 
    }  
    ConstOverlode(int age,String n ,double p){ 
    name = n;  
     //age = a;  
    }  
    void display(){ 
        System.out.println(age+" "+name);
    }  
   
    public static void main(String args[]){  
    ConstOverlode s1 = new ConstOverlode( 23, "Dushman" );  
    ConstOverlode s2 = new ConstOverlode(  23 ,"nalin" , 10);  
    s1.display();  
    s2.display(); 
    }  
}
    
    
