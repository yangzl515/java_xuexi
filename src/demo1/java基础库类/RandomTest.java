package demo1.java基础库类;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Zhong.Yl
 * 2024/4/10 17:05
 * java_xuexi
 */
public class RandomTest {
    public static void main(String[] args){
        Random rand = new Random();
        System.out.println(rand.nextInt());
        byte[] buffer = new byte[16];
        rand.nextBytes(buffer);
        System.out.println(Arrays.toString(buffer));
        System.out.println(rand.nextDouble());

    }
}
