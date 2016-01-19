class A{
    A(){
    //super();
    System.out.println("A class");
    }}
class B extends A{
    B(){
    //super();
    System.out.println("B class");
    }}
class C extends B{
    C(){
    //super();
    System.out.println("C class");
    }}
public class SuperCall {
    public static void main(String[] args) {
       B p = new B();
    }}
