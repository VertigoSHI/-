package Factory;

//每次多一个交通工具都要修改
public class CarFactory
{
    public Car createCar() {return new Car();}
}
