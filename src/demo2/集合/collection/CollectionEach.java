package demo2.集合.collection;

import java.util.Collection;
import java.util.HashSet;

/**
 * @author Zhong.Yl
 * 2024/4/11 8:46
 * java_xuexi
 */
//使用Lambda遍历集合
public class CollectionEach {
    public static void main(String[] args){
        Collection a = new HashSet();
        a.add("yang");
        a.add("zhong");
        a.add("lin");
        a.forEach(obj -> System.out.println("使用forEach遍历集合" + obj));
    }
}
