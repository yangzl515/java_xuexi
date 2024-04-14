package dome3.IO流;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * @author Zhong.Yl
 * 2024/4/14 12:02
 * java_xuexi
 */
public class ReadObject {
    public static void main(String[] args){
        try(
                //创建一个ObjectInputStream输入流
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.txt"))
                )
        {
            //从输入流中读取一个 Java对象，并将其强制类型转换为 Person类
            Person p = (Person)ois.readObject();
            System.out.println("名字："+ p.getName()+ "\n年龄："+p.getAge());
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
