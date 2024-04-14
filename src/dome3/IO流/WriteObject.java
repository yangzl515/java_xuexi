package dome3.IO流;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author Zhong.Yl
 * 2024/4/14 11:48
 * java_xuexi
 */
public class WriteObject {
    public static void main(String[] args){
        try(
                //创建一个ObjectOutputStream输出流
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object.txt"))
                )
        {
            Person per = new Person("孙悟空", 500);
            //将per对象写入输出流
            oos.writeObject(per);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
