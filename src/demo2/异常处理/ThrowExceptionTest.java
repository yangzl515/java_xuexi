package demo2.异常处理;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author Zhong.Yl
 * 2024/4/12 9:36
 * java_xuexi
 */
//使用throw抛出异常
public class ThrowExceptionTest {
    public static void main(String[] args) throws FileNotFoundException {
        test();
    }
    public static void test() throws FileNotFoundException {
        FileInputStream i = new FileInputStream("a.txt");
    }
}
