package dome3.多线程;

import java.util.Date;

/**
 * @author Zhong.Yl
 * 2024/4/21 14:35
 * java_xuexi
 */
public class SleepTest
{
    public static void main(String[] args) throws InterruptedException {
        for(int i = 0; i < 10; i++)
        {
            System.out.println("当前时间：" + new Date());
            //调用sleep()方法让当前线程暂停1s
            Thread.sleep(1000);
        }
    }
}
