package demo1.java基础.array;

/**
 * @author Zhong.Yl
 * 2024/4/6 12:26
 * java_xuexi
 */
public class PrimitiveArrayTest {
    public static void main(String[] args){
        //定义一个数组
        int[] arrs;
        arrs = new int[5];
        //采用循环方式为每一个元素赋值
        for (int i = 0; i<arrs.length; i++)
        {
            arrs[i] = i + 11;
        }
        for(int arr : arrs)
        {
            System.out.println(arr);
        }
    }
}
