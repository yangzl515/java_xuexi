package demo2.集合.collection;

import java.util.LinkedHashSet;

/**
 * @author Zhong.Yl
 * 2024/4/11 12:44
 * java_xuexi
 */
//使用LinkedHashSet，它访问元素是按照元素添加的顺序

public class LinkedHashSetTest {
    public static void main(String[] args){
        LinkedHashSet lin = new LinkedHashSet();
        lin.add("yang");
        lin.add("zhong");
        lin.add("lin");
        System.out.println(lin);
        lin.remove("zhong");
        System.out.println(lin);
        //比较添加元素的顺序
        lin.add("zhong");
        System.out.println(lin);
    }
}
