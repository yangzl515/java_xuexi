package dome3.IO流;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Zhong.Yl
 * 2024/4/12 17:16
 * java_xuexi
 */
public class FileOutputStreamTest {
    public static void main(String[] args) throws IOException {
        //创建字节输入流
        FileInputStream fis = new FileInputStream("FileInputStream.java");
        //创建字符输入流
        FileOutputStream fos = new FileOutputStream("FileOutputStream.txt");
        byte[] bbno = new byte[32];
        int hasRead = 0;
        while((hasRead = fis.read(bbno)) > 0){
            fos.write(bbno,0,hasRead);
        }
    }
}
