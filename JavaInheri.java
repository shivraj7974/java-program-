public class JavaInheri {
    public static void main(String[] args)
     {
        Tiger t = new Tiger();
        t.eat();
        t.attack();
    }
}
class Animal
{
    String Color;
    void eat()
    {
        System.out.println("tiger is Eating");
    }
    void attack()
    {
        System.out.println("tiger is attacking");
    }
}
class Tiger extends Animal
{
    void walk()
    {
        System.out.println("walking");
    }
}
class fish extends Animal
{
    int fins;
    void swim()
    {
        System.out.println("swim in water");
    }
}
class birds extends Animal
{
    void fly()
    {
        System.out.println("flying");
    }
}