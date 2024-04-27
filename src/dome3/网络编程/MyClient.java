package dome3.网络编程;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

/**
 * @author Zhong.Yl
 * 2024/4/26 9:10
 * java_xuexi
 */
public class MyClient {
    public static void main(String[] args) throws Exception
    {
        Socket s = new Socket("127.0.0.1", 3000);
        //客户端启动 ClientdThread 线程不断地读取来自服务器的数据
        new Thread(new ClientThread(s)).start();
        //获取该 Socket 对应的输出流
        PrintStream ps = new PrintStream(s.getOutputStream());
        //不断地读取键盘输入
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while((line = br.readLine()) != null)
        {
            //将用户的键盘输入内容写入 Socket对应的输出流
            ps.println(line);
        }
    }
}