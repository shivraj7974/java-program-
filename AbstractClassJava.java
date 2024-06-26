public class AbstractClassJava {
    public static void main(String args[])
    {
        Horse h = new Horse();
        h.eat();
        h.walk();
        chicken c = new chicken();
        c.eat();
        c.walk();
    }
}
abstract class Animal{
    void eat()
    {
        System.out.println("animal is eating ");
    }
    abstract void walk();
}
class Horse extends Animal{
    void walk()
    {
        System.out.println("walks on 4 legs");
    }
}
class chicken extends Animal
{
    void walk()
    {
        System.out.println("walks on 2 legs");
    }
}