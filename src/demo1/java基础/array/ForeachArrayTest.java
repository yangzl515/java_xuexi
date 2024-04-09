package demo1.java基础.array;

/**
 * @author Zhong.Yl
 * 2024/4/6 12:07
 * java_xuexi
 */
public class ForeachArrayTest {
    public static void main(String[] args){
        //先定义一个数组并初始化,简洁方式
        int[] arrs = {1,2,3,4,5,6,7,8,9};
        //使用foreach循环，将arrs数组中的元素依次赋值给arr
        for (int arr : arrs)
        {
            //将已赋值的arr输出
            System.out.println(arr);
            //
        }
    }
}
