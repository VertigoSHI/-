package Singleton;

import java.io.*;

public class DoubleCheckLock implements Serializable
{
    private static DoubleCheckLock instance;

    public static DoubleCheckLock getInstance()
    {
        if(instance==null)
        {
            try
            {
                Thread.sleep(10);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
            synchronized (DoubleCheckLock.class)
            {
                if(instance==null)
                {
                    instance = new DoubleCheckLock();
                }

            }
        }
        return instance;
    }

    private Object readResolve () throws ObjectStreamException
    {
        return DoubleCheckLock.getInstance();
    }

    public static void main(String[] args)
    {
        //序列化与反序列化
        try
        {
            File file = new File("ObjectTest.tmp");
            if(!file.exists()) file.createNewFile();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
            DoubleCheckLock tmp = DoubleCheckLock.getInstance();

            System.out.println(tmp.hashCode());

            objectOutputStream.writeObject(tmp);
            objectOutputStream.close();
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));

            tmp = (DoubleCheckLock) objectInputStream.readObject();
            System.out.println(tmp.hashCode());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
