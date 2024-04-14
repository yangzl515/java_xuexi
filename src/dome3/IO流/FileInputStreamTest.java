package dome3.IO流;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author Zhong.Yl
 * 2024/4/12 16:48
 * java_xuexi
 */
public class FileInputStreamTest {
    public static void main(String[] args) throws IOException {
        //创建字节输入流
        FileInputStream fis = new FileInputStream("FileInputStream.java");
        //创建一个长度为1024的数组
        byte[] bbn = new byte[1024];
        //用来保存实际读取数
        int hasRead = 0;
        while((hasRead = fis.read(bbn)) > 0){
            System.out.println(new String(bbn,0,hasRead));
        }
        System.out.println(hasRead);
        //关闭文件输出流
        fis.close();
    }
}
