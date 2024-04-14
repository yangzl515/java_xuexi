package dome3.IO流;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author Zhong.Yl
 * 2024/4/14 9:07
 * java_xuexi
 */
public class RandomAccessFileTest {
    public static void main(String[] args){
        try(
                RandomAccessFile raf = new RandomAccessFile("RandomAccessFile.java", "r");
                ){
            //获取 RandomAccessFile对象文件指针的位置，初始位置是0
            System.out.println("RandomAccessFile的文件指针的初始位置：" + raf.getFilePointer());
            //移动 raf 的文件记录指针的位置
            raf.seek(3);
            byte[] bbuf = new byte[1024];
            //用于保存实际读取的字节数
            int hasRead = 0;
            //使用循环来取数
            while((hasRead = raf.read(bbuf)) > 0){
                System.out.print(new String(bbuf,0,hasRead));
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
