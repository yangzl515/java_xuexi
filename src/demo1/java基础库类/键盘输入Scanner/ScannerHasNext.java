package demo1.java基础库类.键盘输入Scanner;

import java.util.Scanner;

/**
 * @author Zhong.Yl
 * 2024/4/10 16:22
 * java_xuexi
 */
//使用hasNextXXX()和nextXXX()
public class ScannerHasNext {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //hasNextInt()判断是否还有下一个输入项
        while (sc.hasNextInt()){
            //sc.nextInt() 表示输出下一个输入项
            System.out.println(sc.nextInt());
        }
    }
}
