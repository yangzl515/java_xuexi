package demo2.集合.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Zhong.Yl
 * 2024/4/11 15:48
 * java_xuexi
 */
//使用List集合的基本方法
public class ListTest {
    public static void main(String[] args){
        List l = new ArrayList();
        l.add(4);
        l.add(2);
        l.add(6);
        l.add(5);
        System.out.println(l);
        l.add(2,10);
        System.out.println(l);
        l.remove(1);
        System.out.println(l);
        l.set(1,22);
        System.out.println(l);
        System.out.println(l.subList(1,3));
    }
}
