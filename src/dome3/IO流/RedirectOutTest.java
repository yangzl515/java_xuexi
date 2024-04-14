package dome3.IO流;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/**
 * @author Zhong.Yl
 * 2024/4/13 8:13
 * java_xuexi
 */
//重定向标准输出
public class RedirectOutTest {
    public static void main(String[] args) throws IOException {
        //一次性创建PrintStream输出流
        PrintStream ps = new PrintStream(new FileOutputStream("RedirectOutTest.java"));
        //将标准输出重定向到ps输出流
        System.setOut(ps);
        //向标准输出输出一个字符串
        System.out.println("----------");
        //向标准输出一个对象
        System.out.println(new RedirectOutTest());
    }
}
