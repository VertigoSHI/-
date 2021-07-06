package Observer;

import java.util.*;

public class Baby
{
    String name;

    PriorityQueue<Observer> queue = new PriorityQueue<Observer>(
            Comparator.comparingInt(o -> -o.priority)
    );

    public void addObserver(Collection<Observer> collections)
    {
        queue.addAll(collections);
    }

    public void addObserver(Observer observer)
    {
        queue.add(observer);
    }

    public void wakeUp()
    {
        for(Observer observer : queue)
        {
            observer.actionOnSth();
        }
    }

}

class dog extends Observer
{
    String name;
    public dog(String name)
    {
        this.priority = 5;
        this.name = name;
    }

    @Override
    public void actionOnSth()
    {
        System.out.println(name + "  is barking");
    }
}

class dad extends Observer
{
    String name;

    public dad(String name)
    {
        this.priority = 3;
        this.name = name;
    }

    @Override
    public void actionOnSth() {
        System.out.println(name + "  is barking");
    }
}
