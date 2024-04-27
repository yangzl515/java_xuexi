package dome3.网络编程;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

/**
 * @author Zhong.Yl
 * 2024/4/24 14:10
 * java_xuexi
 */
public class GetPostTest
{
    /*
    * 向指定 URL 发送 GET 方式的请求
    * @Param url 发送请求的 URL
    * @Param param 请求参数，格式满足 name=value1&name2=value2
    * @return URL 代表远程资源的响应
    * */
    public static String sendGet(String url, String param)
    {
        String result = "";
        String urlName = url + "?" + param;
        try
        {
            URL realUrl = new URL(urlName);
            //打开和 URL 之间的连接
            URLConnection conn = realUrl.openConnection();
            //设置通用的请求属性
            conn.setRequestProperty("accept", "*/*");
            conn.setRequestProperty("connection", "Keep-Alive");
            conn.setRequestProperty("user-agent", "Monzilla/4.0 (compatible; MSIE 6.0;Window NT 5.1; SV1)");
            //建立实际连接
            conn.connect();
            //获取所有的响应头字段
            Map<String, List<String>> map = conn.getHeaderFields();
            //遍历所有的响应头字段
            for (String key : map.keySet())
            {
                System.out.println(key + "--->" + map.get(key));
            }
            try
            (
                    //定义 BufferedReader 输入流来读取 URL 的响应
                    BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8")))
                {
                    String line;
                    while((line = in.readLine()) != null)
                    {
                        result += "\n" + line;
                    }
                }
        }
        catch(Exception e)
        {
            System.out.println("发送 GET 请求出现异常！" + e);
            e.printStackTrace();
        }
        return result;
    }
    /*
    * 向指定 URL 发送 POST 方式的请求
    * @param url 发送请求的URL
    * @Param param 请求参数，格式满足 name=value1&name2=value2
    * @return URL 代表远程资源的响应
    * */
    public static String sendPost(String url, String param)
    {
        String result = "";
        try {
            URL realUrl = new URL(url);
            //打开和 URL 之间的连接
            URLConnection conn = realUrl.openConnection();
            //设置通用的请求属性
            conn.setRequestProperty("accept", "*/*");
            conn.setRequestProperty("connection", "Keep-Alive");
            conn.setRequestProperty("user-agent", "Monzilla/4.0 (compatible; MSIE 6.0;Window NT 5.1; SV1)");
            //发送 POST 请求必须设置如下两行
            conn.setDoOutput(true);
            conn.setDoInput(true);
            try (
                    //获取 URLConnection 对象对应的输出流
                    PrintWriter out = new PrintWriter(conn.getOutputStream())
            ) {
                //发送请求参数
                out.print(param);
                //flush输出流的缓冲
                out.flush();
            }
            try (
                    //定义 BufferedReader输入流来读取 URL的响应
                    BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8"))
            ) {
                String line;
                while ((line = in.readLine()) != null) {
                    result += "\n" + line;
                }
            }
        }
            catch (Exception e) {
                System.out.println("发送 POST 请求出现异常!" + e);
                e.printStackTrace();
            }
            return result;
        }
        //提供主方法，测试发送 GET 请求和 POST 请求
    public static void main(String[] args)
    {
        //发送 GET 请求
        String s = GetPostTest.sendGet("http://localhost:8888/abc/a.jsp", null);
        System.out.println(s);
        //发送 POST 请求
        String sl = GetPostTest.sendPost("http://localhost:8888/abc/a.jsp", "name=crazyit.org&pass=leegang");
        System.out.println(sl);
    }
}
