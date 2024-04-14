package dome3.IO流;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * @author Zhong.Yl
 * 2024/4/14 8:02
 * java_xuexi
 */
public class WriteToProcessTest {
    public static void main(String[] args) throws IOException {
        //运行 java ReadStandard命令，返回运行该命令的子进程
        Process p = Runtime.getRuntime().exec("java ReadStandard");
        try(
                //以 p进程的输出流创建PrintStream对象
                //这个输出流对本程序是输出流，对 p进程则是输出流
                PrintStream ps = new PrintStream(p.getOutputStream());
                ){
            //向 ReadStandard程序写入内容，这些内容将被 ReadStandard 读取
            ps.println("普通字符串");
            ps.println(new WriteToProcessTest());
        }
    }
}
//定义一个 ReadStandard类，该类可以接收标准输入
class ReadStandard{
    public static void main(String[] args){
        try(
                //使用 System.in 创建 Scanner对象，用于获取标准输入
                Scanner sc = new Scanner(System.in);
                PrintStream ps = new PrintStream(new FileOutputStream("out.txt"))
                ){
            //增加下面一行只把回车作为分隔符
            sc.useDelimiter("\n");
            //判断是否还有下一个输入项
            while(sc.hasNext()){
                //输入输出项
                ps.println("键盘输入的内容是：" + sc.next());
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}