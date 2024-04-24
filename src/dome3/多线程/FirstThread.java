package dome3.多线程;

/**
 * @author Zhong.Yl
 * 2024/4/19 14:20
 * java_xuexi
 */
public class FirstThread extends Thread {
    private int i;
    //重写run()方法
    public void run(){
        for( ; i < 100; i++){
            //当线程类继承 Thread类时，直接使用 this即可获取当前线程
            //Thread对象的getName()返回当前线程的名字
            //因此可以直接调用getName()方法返回当前线程的名字
            System.out.println(getName() +" " +i);
        }
    }
    public static void main(String[] args){
        for(int i = 0; i < 100; i++){
            //调用 Thread的 currentdThread()方法获取当前线程
            System.out.println(Thread.currentThread().getName() +" " + i);
            if(i == 20){
                //创建并启动第一个线程
                new FirstThread().start();
                //创建并启动第二个线程
                new FirstThread().start();
            }
        }
    }
}
