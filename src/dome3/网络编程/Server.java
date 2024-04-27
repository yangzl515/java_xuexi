package dome3.网络编程;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Zhong.Yl
 * 2024/4/24 17:09
 * java_xuexi
 */
public class Server
{
    public static void main(String[] args) throws IOException {
        //创建一个ServerSocket，用于监听客户端Socket的连接请求
        ServerSocket ss = new ServerSocket(30000);
        //采用循环不断地接收来自客户端的请求
        while(true)
        {
            //每当接收到客户端 Socket的请求时，服务器端也对应产生一个Socket
            Socket s = ss.accept();
            //将 Socket 对应的输出流包装成PrintStream
            PrintStream ps = new PrintStream(s.getOutputStream());
            //进行普通IO 操作
            ps.println("您好，您收到了服务器的新年快乐");
            //关闭输出流，关闭Socket
            ps.close();
            s.close();
        }
    }
}
