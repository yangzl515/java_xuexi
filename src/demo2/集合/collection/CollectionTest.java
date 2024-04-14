package demo2.集合.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * @author Zhong.Yl
 * 2024/4/11 8:25
 * java_xuexi
 */
public class CollectionTest {
    public static void main(String[] args){
        Collection a = new ArrayList();
        a.add("zhong");
        a.add("lin");
        a.add(1);
        a.add("yang");
        System.out.println(a);
        a.remove("yang");
        System.out.println(a);
        System.out.println("集合中是否包含lin    "+ a.contains("lin"));

        Collection b = new HashSet();
        b.add("璀璨冒险人");
        b.add("无名的人");
        System.out.println("c集合是否全部包含b集合   "+ a.containsAll(b));
        b.removeAll(b);
        System.out.println(b.size());
    }
}
