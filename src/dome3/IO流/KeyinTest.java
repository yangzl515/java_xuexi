package dome3.IO流;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Zhong.Yl
 * 2024/4/12 19:39
 * java_xuexi
 */
public class KeyinTest {
    public static void main(String[] args) throws IOException {
        //将System.in 对象转换成Reader对象
        InputStreamReader reader = new InputStreamReader(System.in);
        //将普通的Reader包装成BufferedReader
        BufferedReader br = new BufferedReader(reader);
        String line = null;
        //采取循环方式来逐行地读取
        while((line = br.readLine()) != null)
        {
            //如果读取的字符串为”exit“则程序退出
            if(line.equals("exit")){
                System.exit(1);
            }
            //打印读取的内容
            System.out.println("输入的内容为；" + line);
        }
    }
}
