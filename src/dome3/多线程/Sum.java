package dome3.多线程;

import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.RecursiveTask;

/**
 * @author Zhong.Yl
 * 2024/4/23 18:28
 * java_xuexi
 */
//继承 RecursiveTask来实现 可分解 任务
class CalTask extends RecursiveTask<Integer>
{
    //每个小任务最多只累加20个数
    private static final int THRESHOLD = 20;
    private int arr[];
    private int start;
    private int end;
    //累加从 start 到 end 的数组元素
    public CalTask(int[] arr, int start, int end)
    {
        this.arr = arr;
        this.start = start;
        this.end = end;
    }
    protected Integer compute()
    {
        int sum = 0;
        //当 end 与 start 之间的差小于THRESHOLD时，开始进行实际累加
        if(end - start < THRESHOLD)
        {
            for(int i = 0; i < end; i++)
            {
                sum += arr[i];
            }
            return sum;
        }
        else
        {
            //当 end 与 start之间的差大于 THRESHOLD,即要累加的数超过20个时，将大任务分解成两个 小任务
            int middle = (start + end) / 2;
            CalTask left = new CalTask(arr, start, middle);
            CalTask right = new CalTask(arr, middle, end);
            //并行执行两个 小任务
            left.fork();
            right.fork();
            //把两个 小任务 结合
            return left.join() + right.join();
        }
    }
}
public class Sum {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int[] arr = new int[100];
        Random rand = new Random();
        int total = 0;
        //初始化100个数字元素
        for (int i = 0,len = arr.length; i < len; i++)
        {
            int tmp = rand.nextInt(20);
            //对数组元素赋值，并将数组元素的值添加到sum总和中
            total += (arr[i] = tmp);
        }
        System.out.println(total);
        //创建一个通用池
        ForkJoinPool pool = ForkJoinPool.commonPool();
        //提交可分解的 CaltTask任务
        Future<Integer> future = pool.submit(new CalTask(arr, 0 , arr.length));
        System.out.println(future.get());
        //关闭线程池
        pool.shutdown();
    }
}
