package demo2.集合.collection;

import java.util.EnumSet;

/**
 * @author Zhong.Yl
 * 2024/4/11 15:23
 * java_xuexi
 */
enum Se
{
    A,B,C,D
}
public class EnumSetTest {
    public static void main(String[] args){
        EnumSet en = EnumSet.allOf(Se.class);
        System.out.println(en);
        EnumSet en2 = EnumSet.noneOf(Se.class);
        //刚创建所以en2里面的内容为空
        System.out.println(en2);
        //只能添加en枚举集合中存在的元素
        en2.add(Se.A);
        System.out.println(en2);
    }
}
