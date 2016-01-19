public class CopyValueUsingConstrust {
    int id;  
    String name;  
    CopyValueUsingConstrust(int i,String n){  
    id = i;  
    name = n;  
    }  
  
    CopyValueUsingConstrust(CopyValueUsingConstrust s){  
    id = s.id;  
    name =s.name;  
    }  
    void display(){System.out.println(id+" "+name);
    }  
    public static void main(String args[]){  
    CopyValueUsingConstrust s1 = new CopyValueUsingConstrust(111,"Karan");  
    CopyValueUsingConstrust s2 = new CopyValueUsingConstrust(s1);  
    s1.display();  
    s2.display();    
    }  
}
