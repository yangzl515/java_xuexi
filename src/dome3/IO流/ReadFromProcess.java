package dome3.IO流;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Zhong.Yl
 * 2024/4/13 18:10
 * java_xuexi
 */
public class ReadFromProcess {
    public static void main(String[] args) throws IOException {
        //运行 javac命令，返回运行该命令的子进程
        Process p = Runtime.getRuntime().exec("javac");
        try(
                //以 p进程的错误流创建BufferedReader对象
                //这个错误流对本程序是输入流，对p进程则是输出流
                BufferedReader br = new BufferedReader(new InputStreamReader(p.getErrorStream()))
                )
        {
            String buff = null;
            //采取循环的方式读取p进程的错误输出
            while((buff = br.readLine()) != null)
            {
                System.out.println(buff);
            }
        }
    }
}
