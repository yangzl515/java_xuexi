package dome3.多线程;

/**
 * @author Zhong.Yl
 * 2024/4/21 10:42
 * java_xuexi
 */
public class StartDead extends Thread {
    private int i;
    public void run()
    {
        for(; i < 100; i++)
        {
            System.out.println(getName() + " " + i);
        }
    }
    public static void main(String[] args)
    {
        //创建线程对象
        StartDead sd = new StartDead();
        for (int i = 0; i < 300; i++)
        {
            //调用Thread的currentThread()方法获取当前线程
            System.out.println(Thread.currentThread().getName() + " " + i);
            if(i == 20)
            {
                //启动线程
                sd.start();
                //判断启动后线程的isAlive()值，输出true
                System.out.println(sd.isAlive());
            }
            //当线程处于新建，死亡两种状态时，isAlive()方法返回false
            //当i>20时，该线程肯定已经启动过了，如果sd.isAlive()为假时，那就是死亡状态
            if(i>20 && !sd.isAlive())
            {
                //试图再次启动该线程
                sd.start();
            }
        }
    }
}
