package demo1.java基础库类.键盘输入Scanner;

import java.util.Scanner;

/**
 * @author Zhong.Yl
 * 2024/4/10 16:17
 * java_xuexi
 */
//使用Scanner
public class ScannerTest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a);
    }
}
