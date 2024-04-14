package dome3.IO流;

import java.io.File;
import java.io.IOException;

/**
 * @author Zhong.Yl
 * 2024/4/12 10:39
 * java_xuexi
 */
public class FileTest {
    public static void main(String[] args) throws IOException {
        File file = new File(".");
        //直接获取文件名，输出一点
        System.out.println(file.getName());//.
        //获取相对路径的父路径，输出null
        System.out.println(file.getParent());//null
        //获取绝对路径
        System.out.println(file.getAbsoluteFile());//D:\idea\code\java_xuexi\.
        //获取上一级路径
        System.out.println(file.getAbsoluteFile().getParent());//D:\idea\code\java_xuexi
        //在当前路径下创建一个临时文件
        File tmpFile = File.createTempFile("aaa",".txt", file);
        //指定当JVM退出时删除该文件
        tmpFile.deleteOnExit();
        //以系统当前时间作为新文件名来创建新文件
        File newFile = new File(System.currentTimeMillis() + "");
        System.out.println("newFile对象是否存在："+ newFile.exists());
        //以指定newFile对象来创建一个文件
        newFile.createNewFile();
        //以newFile对象来创建一个目录，因为newFile已经存在
        //所以下面方法返回false，既无法创建该目录
        newFile.mkdir();
        //使用list()方法列出当前路径下的所有文件和路径
        String[] fileList = file.list();
        System.out.println("===当前路径下所有文件和路径如下===");
        for(String fileName : fileList){
            System.out.println(fileName);
        }
        //listRoots（）静态方法列出所有的磁盘根路径
        File[] roots = File.listRoots();
        System.out.println("===系统所有根路径如下===");
        for(File root : roots){
            System.out.println(root);
        }
    }
}
