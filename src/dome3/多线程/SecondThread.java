package dome3.多线程;

/**
 * @author Zhong.Yl
 * 2024/4/19 15:47
 * java_xuexi
 */
public class SecondThread extends Thread
{
    private int i;
    //重写run方法
    public void run()
    {
        for(;i < 100; i++)
        {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
    public static void main(String[] args){
        for(int i = 0; i < 100; i++)
        {
            System.out.println(Thread.currentThread().getName() + " " + i);
            if(i == 20)
            {
                SecondThread st = new SecondThread();
                //通过new Thread(target,name)方法创建新线程
                new Thread(st,"新线程1").start();
                new Thread(st,"新线程2").start();
            }
        }
    }
}
