public class InstentFRInstance {
    int age = 23;
    String name = "dushman";
    
    void  school(){
        int hight = 6;                              ///this is a methode globle variable
        System.out.println("Richmond Collage");
    }
    void details(){        
       /* InstentFRInstance B = new InstentFRInstance();
        B.school();*/
        school();
        System.out.println(name);
        System.out.println(age);
     // System.out.println(B.hight); // cnot do this    
    }
    
    public static void main(String[] args) {
        InstentFRInstance A = new InstentFRInstance();
        A.details();
       
    }
    
}
