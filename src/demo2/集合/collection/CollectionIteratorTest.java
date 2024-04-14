package demo2.集合.collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * @author Zhong.Yl
 * 2024/4/11 8:56
 * java_xuexi
 */
public class CollectionIteratorTest {
    public static void main(String[] args){
        //创建一个集合
        Collection books = new HashSet();
        books.add("yang");
        books.add("zhong");
        books.add("lin");
        //获取books的迭代器
        Iterator it = books.iterator();
        while(it.hasNext()){
            //it.next()返回的下一个元素是object类型的，因此需要类型转换
            String a = (String)it.next();
            System.out.println(a);
            if(books.equals("yzl")){
                //从集合中删除上一次返回的元素
                it.remove();
            }
            a = "字符串测试";
        }
        System.out.println(books);
    }
}
