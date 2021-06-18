package Factory;

//每多一种交通工具都得添加
public class SimpleMovableFactory
{
    public Car createCar()
    {
        //这里应该有扩展的 对于生成对象的处理或者权限处理
        return new Car();
    }
    public Plane createPlane()
    {
        return new Plane();
    }

}
