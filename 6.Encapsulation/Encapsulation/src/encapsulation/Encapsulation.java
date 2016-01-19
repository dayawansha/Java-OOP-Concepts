package encapsulation;

public class Encapsulation {

    private int age;
    String name;

    public void setAge(int x) {
        if (x > 30 & x < 100) {
            age = x;
        }
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Encapsulation A = new Encapsulation();
        A.setAge(60);
        A.getAge();
        System.out.println(A.age);
        System.out.println(A.getAge());
    }
}
