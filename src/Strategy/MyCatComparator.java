package Strategy;

import java.util.Comparator;

public abstract class MyCatComparator implements Comparator
{

}

class MyCatWeightIncreaseComparator extends MyCatComparator
{
    @Override
    public int compare(Object o1, Object o2) {
        Cat a = (Cat)o1;
        Cat b = (Cat)o2;
        return a.weight != b.weight ? a.weight-b.weight : a.height-b.height;
    }

    static class InstanceHolder
    {
        private static final MyCatWeightIncreaseComparator instance = new MyCatWeightIncreaseComparator();
    }

    public static MyCatComparator getInstance() {
        return InstanceHolder.instance;
    }

}
class MyCatWeightDecreaseComparator extends MyCatComparator
{

    static class InstanceHolder
    {
        private static final MyCatWeightDecreaseComparator instance = new MyCatWeightDecreaseComparator();
    }


    public static MyCatComparator getInstance() {
        return InstanceHolder.instance;
    }

    @Override
    public int compare(Object o1, Object o2) {
        Cat a = (Cat)o1;
        Cat b = (Cat)o2;
        return a.weight != b.weight ? b.weight-a.weight : a.height-b.height;
    }

}