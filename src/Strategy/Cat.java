package Strategy;

public class Cat implements Comparable<Cat>
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

    @Override
    public int compareTo(Cat o) {
        Cat tmp = o;
        return this.weight != tmp.weight ? this.weight-tmp.weight : this.height-tmp.height;
    }
}
