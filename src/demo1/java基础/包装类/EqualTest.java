package demo1.java基础.包装类;

/**
 * @author Zhong.Yl
 * 2024/4/9 20:18
 * java_xuexi
 */
public class EqualTest {
    public static void main(String[] args){
        int i1 = 22;
        int i2 = 22;
        float float1 = 22.0f;
        float float2 = 22.0f;
        //System.out.println("这两个数使用equal是否相等"+ (i2.equals(i1)));
        //System.out.println("这两个数使用equal是否相等"+ (float2.equals(float    1)));
        String str = "yang";
        String str1 = "yang";
        System.out.println(str.equals(str1));

    }
}
