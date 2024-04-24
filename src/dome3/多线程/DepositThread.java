package dome3.多线程;

/**
 * @author Zhong.Yl
 * 2024/4/23 9:35
 * java_xuexi
 */
public class DepositThread extends Thread {
    //模拟用户账户
    private Account account;
    //当前存款线程希望存的钱数
    private double depositAmount;
    public DepositThread(String name, Account account, double depositAmount)
    {
        super(name);
        this.account = account;
        this.depositAmount = depositAmount;
    }
    //重复100次执行存钱操作
    public void run()
    {
        for(int i = 0; i < 100; i++)
        {
            account.deposit(depositAmount);
        }
    }
}
