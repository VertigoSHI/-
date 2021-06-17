package AbstractFactory;

public class Main
{
    public static void main(String[] args) {
        Car c = new Car();
        c.go();
        Gun g = new Gun();
        g.shoot();
        Bread b = new Bread();
        b.printName();
    }
}
