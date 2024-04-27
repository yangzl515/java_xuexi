package dome3.网络编程;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

/**
 * @author Zhong.Yl
 * 2024/4/26 8:48
 * java_xuexi
 */
public class ServerThread implements Runnable {
    //定义当前线程所处理通信的线程类
    Socket s = null;
    //该线程所处理的Socket的对应的输入流
    BufferedReader br = null;
    public ServerThread(Socket s) throws IOException {
        this.s = s;
        //初始化该 Socket对应的输入流
        br = new BufferedReader(new InputStreamReader(s.getInputStream()));
    }
    @Override
    public void run() {
        try{
            String content = null;
            //采用循环不断地从Socket 中读取客户端发送过来的数据
            while ((content = readFromClient()) != null)
            {
                //遍历socketList中的每个Socket,将读到的内容向每个 Socket发送一次
                for(Socket s : MyServer.socketList)
                {
                    PrintStream ps = new PrintStream(s.getOutputStream());
                    ps.println(content);
                }
            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
    //定义读取客户端数据的方法
    private String readFromClient()
    {
        try
        {
            return br.readLine();
        }
        //如果捕获到异常，则表明该 Socket对应的客户端已经关闭
        catch(IOException e)
        {
            //删除该 Socket
            MyServer.socketList.remove(s);
        }
        return null;
    }
}
