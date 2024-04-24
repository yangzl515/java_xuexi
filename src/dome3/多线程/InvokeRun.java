package dome3.多线程;

/**
 * @author Zhong.Yl
 * 2024/4/21 9:43
 * java_xuexi
 */
public class InvokeRun extends Thread {
    private int i;
    //重写run()方法
    public void run()
    {
        for(int i = 0; i < 100; i++)
        {
            //直接调用run()方法时，Thread的this.getName()返回的是该对象的名字，而不是当前线程的名字
            //使用Thread.currentThread().getName()总是获取当前线程的名字
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
    public static void main(String[] args)
    {
        for(int i = 0; i < 100; i++)
        {
            //调用Thread的currentThread()方法获取当前线程
            System.out.println(Thread.currentThread().getName() + " " + i);
            if(i == 20)
            {
                //直接调用线程对象的run()方法，系统会把线程对象当成普通对象，把run()方法当成普通方法
                //所以下面两行代码不会启动两个线程
                new InvokeRun().run();
                new InvokeRun().run();
            }
        }
    }
}
