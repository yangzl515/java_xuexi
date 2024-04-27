package dome3.网络编程;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * @author Zhong.Yl
 * 2024/4/26 8:04
 * java_xuexi
 */
public class Client {
    public static void main(String[] args) throws IOException
    {
        Socket socket = new Socket("127.0.0.1", 30000);
        //将Socket对应的输入流包装成 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        //进行普通 IO操作
        String line = br.readLine();
        System.out.println("来自服务器的数据：" + line);
        //关闭输入流，关闭Socket
        br.close();
        socket.close();
    }
}
