package Singleton;

import java.util.Random;

public enum MyEnum
{
    INSTANCE;
    Random random = new Random();
    int num = random.nextInt(100);

    public static MyEnum getInstance()
    {
        return INSTANCE;
    }

    public static void main(String[] args) {
        for(int i=0;i<=1000;i++)
        {
            new Thread(()->{
                System.out.println(MyEnum.getInstance().hashCode());
            }).start();
        }
    }
}
