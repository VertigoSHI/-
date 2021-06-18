package AbstractFactory;

public class ModernFactory extends AbstractFactory
{
    @Override
    Weapon createWeapon() {
        return new Gun();
    }

    @Override
    Food createFood() {
        return new Bread();
    }

    @Override
    Movable createMovable() {
        return new Car();
    }
}
