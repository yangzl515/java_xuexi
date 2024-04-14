package dome3.IO流;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/**
 * @author Zhong.Yl
 * 2024/4/12 18:18
 * java_xuexi
 */
public class PrintStreamTest {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("haha.txt");
        PrintStream ps = new PrintStream( fos);
        ps.println("哈哈");
        ps.println(new PrintStreamTest());
    }
}
