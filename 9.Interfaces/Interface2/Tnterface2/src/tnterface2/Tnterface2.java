package tnterface2;

interface A{
void art();
}
interface B{
void art();
}
class Y implements A,B{
    public void art(){
        System.out.println("two methodes in same name");}
}
public class Tnterface2 {
    public static void main(String[] args) {
        Y a = new Y();
        a.art();
    }  
}
