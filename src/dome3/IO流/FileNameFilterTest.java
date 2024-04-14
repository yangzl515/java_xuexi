package dome3.IO流;

import java.io.File;

/**
 * @author Zhong.Yl
 * 2024/4/12 12:25
 * java_xuexi
 */
public class FileNameFilterTest {
    public static void main(String[] args){
        File file = new File(".");
        //使用Lanbda表达式实现文件过滤器
        String[] nameList = file.list((dir,name) -> name.endsWith(".java") || new File(name).isDirectory());
        for (String name : nameList){
            System.out.println(name);
        }
    }
}
