package dome3.IO流;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author Zhong.Yl
 * 2024/4/14 9:34
 * java_xuexi
 */
public class AppendContent {
    public static void main(String[] args){
        try(
                //以读写方式打开一个RandomAccessFile对象
                RandomAccessFile raf = new RandomAccessFile("out.txt","rw");
                ){
            //将记录指针移动到out.txt文件的最后
            raf.seek(raf.length());
            raf.write("这里是追加的内容\r\n".getBytes());
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
