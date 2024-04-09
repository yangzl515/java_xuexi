package demo1.java基础.包装类;

/**
 * @author Zhong.Yl
 * 2024/4/9 19:21
 * java_xuexi
 */
public class Primitive2String {
    public static void main(String[] args){
        String intStr = "123";
        //将特定的字符串转换为int
        int intStr1 = Integer.parseInt(intStr);
        int intStr2 = Integer.valueOf(intStr);
        System.out.println(intStr);

        String floatStr = "2.43";
        //将特定字符串转换为float类型
        float floatStr1 = Float.parseFloat(floatStr);
        float floatStr2 = Float.valueOf(floatStr);
        //float floatStr3 = floatStr;这个将会报错，因为直接转换的话，他们之间的类型不同

        String floatStr4 = String.valueOf(2.33f);
    }
}
