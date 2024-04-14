package demo1.java基础库类.args;

/**
 * @author Zhong.Yl
 * 2024/4/10 16:08
 * java_xuexi
 */
public class ArgsTest {
    public static void main(String[] args){
        System.out.println("args数组的长度为：" + args.length);
        for (String arg : args){
            System.out.println(arg);
        }
    }
}
