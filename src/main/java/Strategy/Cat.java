package Strategy;

public class Cat
{
    int weight;

    int height;

    Cat(){}

    Cat(int weight, int height)
    {
        this.weight = weight;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }

}