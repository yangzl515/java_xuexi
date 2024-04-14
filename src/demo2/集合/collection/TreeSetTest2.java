package demo2.集合.collection;

import java.util.TreeSet;

/**
 * @author Zhong.Yl
 * 2024/4/11 14:03
 * java_xuexi
 */

class Z implements Comparable{
    int a ;
    public Z(int a) {
        this.a  = a;
    }
    //重写equals
    public boolean equals(Object obj){
        return true;
    }
    //重写compareTo
    public int compareTo(Object obj){
        return 1;
    }
}
public class TreeSetTest2 {
    public static void main(String[] args){
        TreeSet tr = new TreeSet();
        Z z = new Z(8);
        tr.add(z);
        System.out.println(tr);
        System.out.println(tr.add(z));//true
        System.out.println(tr);
    }
}
