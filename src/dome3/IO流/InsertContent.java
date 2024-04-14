package dome3.IO流;


import java.io.*;

/**
 * @author Zhong.Yl
 * 2024/4/14 9:40
 * java_xuexi
 */
public class InsertContent {
    public static void insert(String fileName, long pos, String insertContent) throws IOException {
        File tmp = File.createTempFile("tmp",null);
        tmp.deleteOnExit();
        try(
            RandomAccessFile raf = new RandomAccessFile(fileName,"rw");
            //使用临时文件来保存插入点后的数据
            FileOutputStream tmpOut = new FileOutputStream(tmp);
            FileInputStream tmpIn = new FileInputStream(tmp)
        ){
            raf.seek(pos);
            //下面代码将插入点后的内容读入临时文件中保存
            byte[] bbuf = new byte[64];
            //用于保存实际读取的字节数
            int hasRead = 0;
            //使用循环方式读取插入点后的数据
            while((hasRead = raf.read(bbuf)) > 0){
                //将读取的数据写入临时文件
                tmpOut.write(bbuf,0,hasRead);
            }
            //插入内容
            //把文件记录指针重新定位到pos位置
            raf.seek(pos);
            //追加需要插入的内容
            raf.write(insertContent.getBytes());
            //追加临时文件的内容
            while((hasRead = tmpIn.read(bbuf)) > 0){
                raf.write(bbuf,0,hasRead);
            }
        }
    }


    public static void main(String[] args) throws IOException {
        insert("InsertContent.java",45,"插入的内容");
    }
}
