package demo1.java基础.流程控制;

import java.util.Scanner;

/**
 * @author Zhong.Yl
 * 2024/4/5 13:49
 * java_xuexi
 */
public class SwitchTest {
    public static void main(String[] args) {
      System.out.println("please input number");
      Scanner num = new Scanner(System.in);
      int i = num.nextInt();
      int a = i /10;
      switch (a)//此处警告：Switch statement can be replaced with enhanced 'switch' 意为 可以替换为增强Switch
      {
          case 1: {
                  System.out.println("不及格");
              System.out.println("加油");
                  break;
              }
          case 2:
          {
              System.out.println("不及格");
              System.out.println("好好学习");
              break;
          }
          case 3:
          {
              System.out.println("不及格");
              System.out.println("加油油");
              break;
          }
          case 4:
          {
              System.out.println("不及格");
              break;
          }
          case 5:
          {
              System.out.println("不及格");
              System.out.println("努力");
              break;
          }
          case 6:
          {
              System.out.println("及格");
              break;
          }
          case 7:
          {
              System.out.println("及格");
              System.out.println("加油鲁丽");
              break;
          }
          case 8:
          {
              System.out.println("及格");
              System.out.println("不错");
              break;
          }
          case 9:
          {
              System.out.println("优秀");
              break;
          }
          case 10:
          {
              System.out.println("满分");
              break;
          }
          default:
          {
              System.out.println("please input correctly");
          }
      }
    }
}
