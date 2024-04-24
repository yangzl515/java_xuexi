package dome3.多线程;

/**
 * @author Zhong.Yl
 * 2024/4/23 9:40
 * java_xuexi
 */
public class DrawTest {
    public static void main(String[] args)
    {
        //创建一个账户
        Account acct = new Account("123",0);
        new DrawThread("取钱1",acct,800,800).start();
        new DrawThread("取钱2",acct,800,800).start();
        new DrawThread("取钱3",acct,800,800).start();
    }
}