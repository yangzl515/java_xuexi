package demo2.集合.Map;

import java.util.LinkedHashMap;

/**
 * @author Zhong.Yl
 * 2024/4/11 18:59
 * java_xuexi
 */
public class LinkedHashMapTest {
    public static void main(String[] args){
        LinkedHashMap lin = new LinkedHashMap();
        lin.put(1,11);
        lin.put(2,22);
        lin.put(3,33);
        System.out.println(lin);
        lin.forEach((key,vaule) -> System.out.println(key + "-->" + vaule));
    }
}
