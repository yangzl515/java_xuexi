package dome3.IO流;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Zhong.Yl
 * 2024/4/13 8:25
 * java_xuexi
 */
public class RedirectInTest {
    public static void main(String[] args) throws IOException {
        FileInputStream fs = new FileInputStream("RedirectIn.java");
        System.setIn(fs);
        //使用System.in创建 Scanner对象，获取标准输入
        Scanner sc = new Scanner(System.in);
        //增加下面一行，只把回车作为分隔符
        sc.useDelimiter("\n");
        //判断是否还有下一个输入项
        while (sc.hasNext()){
            System.out.println("键盘的输入是：" + sc.next());
        }
    }
}
