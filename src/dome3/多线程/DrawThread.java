package dome3.多线程;

/**
 * @author Zhong.Yl
 * 2024/4/23 9:31
 * java_xuexi
 */
public class DrawThread extends Thread {
    //模拟用户账户
    private Account account;
    //当前取钱线程所希望取钱数
    private double drawAmount;
    public DrawThread(String name, Account account, double drawAmount, int i)
    {
        super(name);
        this.account = account;
        this.drawAmount = drawAmount;
    }
    //重复100次执行取钱操作
    public void run()
    {
        for(int i = 0; i < 100; i++)
        {
            account.draw(drawAmount);
        }
    }
}
