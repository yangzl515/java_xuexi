package demo2.集合.collection;

import java.util.TreeSet;

/**
 * @author Zhong.Yl
 * 2024/4/11 13:43
 * java_xuexi
 */
public class TreeSetTest {
    public static void main(String[] args){
        TreeSet tree = new TreeSet();
        tree.add(1);
        tree.add(3);
        tree.add(44);
        tree.add(23);
        tree.add(-2);
        System.out.println(tree);//[-2, 1, 3, 23, 44]
        //输出集合第一个元素
        System.out.println(tree.first());//-2
        //输出集合最后一个元素
        System.out.println(tree.last());//44
        //输出小于20的元素
        System.out.println(tree.headSet(20));//[-2, 1, 3]
        //输出大于20的元素
        System.out.println(tree.tailSet(20));//[23, 44]
        //输出在10到40的元素
        System.out.println(tree.subSet(10,40));//[23]
    }
}
