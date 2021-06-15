package Strategy;

import java.util.Arrays;

public class MySort
{
    public static void main(String[] args) {
        Cat[] arrays = new Cat[3];
        arrays[0] = new Cat(10,10);
        arrays[1] = new Cat(15,10);
        arrays[2] = new Cat(15,8);

        Arrays.sort(arrays);
        for(Cat cat : arrays)
        {
            System.out.println(cat);
        }
    }
}
