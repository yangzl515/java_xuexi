package demo1.java基础.array;

/**
 * @author Zhong.Yl
 * 2024/4/6 11:02
 * java_xuexi
 */
public class ArrayException {
    public static void main(String[] args){
        //这里一共有6个元素，但他的索引是从0~5
        int[] arr = new int[] {1,2,3,4,5,6};
        //这是正常的
        System.out.println(arr[1]);
        //这里索引值大于5，但不会报错，可是在运行时会出现异常：Index 7 out of bounds for length 6
        System.out.println(arr[7]);
        //这里索引值是6，虽然没有超过长度6，但是数组下标是从0开始的，所以最大访问下标为5
        //Index 6 out of bounds for length 6
        System.out.println(arr[6]);
    }
}
