package dome3.IO流;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

/**
 * @author Zhong.Yl
 * 2024/4/12 19:06
 * java_xuexi
 */
public class StringNodeTest {
    public static void main(String[] args){
        String src = "从明天起，做一个幸福的人\n"
                + "喂马，劈柴，周游世界\n"
                +"从明天起，关心粮食和蔬菜\n"
                +"我有一个房子，面朝大海，吹暖花开\n"
                +"从明天起，和每一个亲人通信\n"
                +"告诉他们我的幸福\n";
        char[] buffer = new char[32];
        int hasRead = 0;
        try(
                StringReader sr = new StringReader(src))
        {
            //采用循环的方式读取字符串
            while((hasRead = sr.read(buffer)) > 0){
                System.out.println(new String(buffer,0,hasRead));
            }
        }
        catch(IOException ioe){
            ioe.printStackTrace();
        }
        try(
                //创建StringWriter时，实际上以一个StringBuffer作为输出节点
                //下面指定的20就是StringBuffer的初始长度
                StringWriter sw = new StringWriter()){
            //调用StringWriter的方法执行输出
            sw.write("有一个美丽的世界，\n");
            sw.write("他在远方等我\n");
            sw.write("那里有天真的孩子，\n");
            sw.write("还有姑娘的酒窝\n");
            System.out.println("---下面是sw字符串子节点的内容---");
            //使用toString()方法返回StringWriter字符串节点的内容
            System.out.println(sw.toString());
        }
        catch(IOException ex){
            ex.printStackTrace();
        }
    }
}
