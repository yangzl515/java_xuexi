package demo1.java基础.流程控制;

import java.util.Scanner;

/**
 * @author Zhong.Yl
 * 2024/4/5 14:30
 * java_xuexi
 */
/*
这里使用的是增强Switch语句
*将原先的'：'改为'->',去掉'break'
* */
public class NewSwitchTest {
    public static void main(String[] args) {
        System.out.println("please input number");
        Scanner num = new Scanner(System.in);
        int i = num.nextInt();
        int a = i /10;
        switch (a)
        {
            case 1,2,3,4,5,6 ->
            {
                System.out.println("不及格");
                System.out.println("加油");
            }
            case 7,8->
            {
                System.out.println("及格");
                System.out.println("好好学习");
            }
            case 9->
            {
                System.out.println("优秀");
                System.out.println("加油油");
            }
            case 10->
            {
                System.out.println("满分");
                System.out.println("加油油");
            }

            default->
            {
                System.out.println("please input correctly");
            }
        }
    }
}
