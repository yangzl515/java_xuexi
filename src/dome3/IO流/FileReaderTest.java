package dome3.IO流;

import java.io.FileReader;
import java.io.IOException;

/**
 * @author Zhong.Yl
 * 2024/4/13 15:50
 * java_xuexi
 */
public class FileReaderTest {
    public static void main(String[] args) throws IOException {

        try(    //创建字符输入流
                FileReader fr = new FileReader("FileReaderTest.java"))
        {
            //创建一个长度为32的数组
            char[] cbuf = new char[32];
            //用于保存实际读取的字符数
            int hasRead = 0;
            //用来循环
            while ((hasRead = fr.read(cbuf)) > 0)
            {
                //读取数组中的字符，将字符数组转换成字符串输出
                System.out.print(new String(cbuf, 0, hasRead));
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
