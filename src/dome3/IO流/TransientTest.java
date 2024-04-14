package dome3.IO流;

import java.io.*;

/**
 * @author Zhong.Yl
 * 2024/4/14 13:46
 * java_xuexi
 */
public class TransientTest {
    public static void main(String[] args)
    {
        try(
                //创建一个 ObjectOutputStream输出流
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("transient.txt"));
                //创建一个ObjectInputStream输入流
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream("transient.txt"))
                )
        {
            Person per = new Person("齐天大圣",1000);
            //系统将per对象转换为字节序列并输出
            oos.writeObject(per);
            Person p = (Person)ois.readObject();
            System.out.println(p.getAge());
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
