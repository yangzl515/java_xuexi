package dome3.多线程;

import java.util.Objects;

/**
 * @author Zhong.Yl
 * 2024/4/23 8:43
 * java_xuexi
 */
public class Account {
    //封装账户编号、账户余额的两个成员变量
    private String accountNo;
    private double balance;
    //标识账户中是否已有存款的旗标
    private boolean flag = false;
    public Account(){}
    public Account(String accountNo, double balance)
    {
        this.accountNo = accountNo;
        this.balance = balance;
    }
    public String getAccountNo() {
        return accountNo;
    }
    public double getBalance() {
        return balance;
    }
    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }
    //因为账户余额不允许随便更改，所以只为balance提供getter方法
    public synchronized void draw(double drawAmount)
    {
        try
        {
            //如果flag为假，表明账户中还没有人存钱进去，取钱方法阻塞
            if(!flag)
            {
                wait();
            }
            else
            {
                //执行取钱操作
                System.out.println(Thread.currentThread().getName() + "取钱：" + balance);
                //将标识账户是否已有存款的旗帜设为false
                flag = false;
                //唤醒其他线程
                notifyAll();
            }
        }
        catch(InterruptedException ex)
        {
            ex.printStackTrace();
        }
    }
    public synchronized void deposit(double depositAmount)
    {
        try
        {
            //如果flag为真，表明账户已有人存钱进去，存钱方法阻塞
            if(flag)
            {
                wait();
            }
            else
            {
                //执行存钱操作
                System.out.println(Thread.currentThread().getName() + "存款" + balance);
                //将表示账户是否已有存款的旗帜设为true
                flag = true;
                notifyAll();
            }
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Account account)) return false;
        return Double.compare(account.balance, balance) == 0 && flag == account.flag && Objects.equals(accountNo, account.accountNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNo, balance, flag);
    }
}
