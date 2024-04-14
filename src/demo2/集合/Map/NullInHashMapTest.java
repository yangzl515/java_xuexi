package demo2.集合.Map;

import java.util.HashMap;

/**
 * @author Zhong.Yl
 * 2024/4/11 18:47
 * java_xuexi
 */
public class NullInHashMapTest {
    public static void main(String[] args){
        HashMap a = new HashMap();
        a.put(null,null);
        a.put(null,null);
        System.out.println(a);//{null=null}
        a.put(1,null);
        System.out.println(a);//{null=null, 1=null}
    }
}
