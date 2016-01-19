package reference_cast;

class Animal {}
class Dog extends Animal {}
class Cat extends Dog {}
class Run extends Cat{}

public class Reference_cast {

    public static void main(String[] args) {

        Animal a = new Animal();
        Dog b = new Dog();
        Cat c = new Cat();

        Animal d = new Dog();     ///   reference aka Animal unata allagena enne Dog object akaki
        Animal e = new Cat();    ///   reference aka Animal unata allagena enne Cat object akaki
        Dog f = new Cat();      ///   reference aka dog unata allagena enne Cat object akaki
        Cat g = new Run();

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        Animal j = a;         //   a reference is animal
        Dog k = (Dog) b;      //   b  reference is dog
        Cat l = (Cat) c;       // c reference is cat

        //Dog m = (Dog) a;           //   error -  a  reference is animal and m is animal object
        Dog n = (Dog) b;             //   b  reference is dog and object is dog
        Dog o = (Dog) c;             //   c reference is cat and c  is cat object
        Dog q = (Dog) e;             //   e reference is Animal and e  is cat object
        Dog r = (Dog) f;            //    f reference is Animal and f  is cat object    ///////////
        Dog s = (Dog) g;            //    g reference is cat and f is run object////////////////////////

        //Cat s = (Cat) a;         // a reference is animal and a is animal object
        // Cat t = (Cat) b;
        Cat u = (Cat) c;
        // Cat v = (Cat) d;         // d reference is animal and d is dog object
        Cat w = (Cat) e;           //  e  reference is animal and e is cat object
        Cat x = (Cat) f;           // f reference is cat and object is cat
    }}
