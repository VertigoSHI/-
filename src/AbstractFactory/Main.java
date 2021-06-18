package AbstractFactory;

public class Main
{
    public static void main(String[] args) {
        AbstractFactory f = new ModernFactory();
        Movable c = f.createMovable();
        c.go();
    }
}
