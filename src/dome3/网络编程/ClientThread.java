package dome3.网络编程;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * @author Zhong.Yl
 * 2024/4/26 9:18
 * java_xuexi
 */
public class ClientThread implements Runnable
{
    //该线程负责处理的 Socket
    private Socket s;
    //该线程所处理的Socket 对应的输入流
    BufferedReader br = null;
    public ClientThread(Socket s) throws IOException {
        this.s = s;
        br = new BufferedReader(new InputStreamReader(s.getInputStream()));
    }
    public void run()
    {
        try
        {
            String content = null;
            //不断地读取 Socket 输入流中的内容，并将这些内容打印输出
            while ((content = br.readLine()) != null)
            {
                System.out.println(content);
            }
        }
            catch(Exception e)
            {
                e.printStackTrace();
            }
    }
}
