package demo2.集合.collection;

import java.util.Collection;
import java.util.HashSet;

/**
 * @author Zhong.Yl
 * 2024/4/11 9:31
 * java_xuexi
 */
//使用removeIf批量删除符合条件的元素
public class PredicateTest {
    public static void main(String[] args){
        //Collection是一个接口，不能直接创建它的对象，只能创建它实现类的对象
        Collection books = new HashSet();
        books.add(new String ("yang"));
        books.add(new String ("zhong"));
        books.add(new String ("lin"));
        System.out.println(books);
        books.removeIf(ele -> ((String)ele).length() > 4);
        System.out.println(books);
    }
}
