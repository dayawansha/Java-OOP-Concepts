
public class CopyValuWhioutCons {
    int id;  
    String name;  
    CopyValuWhioutCons(int i,String n){  
    id = i;  
    name = n;  
    }  
    CopyValuWhioutCons(){}  
    void display(){
        System.out.println(id+" "+name);
    }  
    public static void main(String[] args) {
    CopyValuWhioutCons s1 = new CopyValuWhioutCons(111,"Karan");  
    CopyValuWhioutCons s2 = new CopyValuWhioutCons();  
     s2.id=s1.id;  
    s2.name=s1.name;  
    s1.display();  
    s2.display();   
    }}
        
    
    
