package demo1.java基础库类.键盘输入Scanner;

import java.io.File;
import java.util.Scanner;

/**
 * @author Zhong.Yl
 * 2024/4/10 16:32
 * java_xuexi
 */
//使用hasNextLine()和nextLine()对文件读出
public class ScannerFileTest{
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("ScannerFileTest.java"));
        //hasNextLine()判断文件是否还有下一行
        while (sc.hasNextLine()){
            //nextLine()输出文件的下一行
            System.out.println(sc.nextLine());
        }
    }
}
