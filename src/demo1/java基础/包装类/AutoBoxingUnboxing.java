package demo1.java基础.包装类;

/**
 * @author Zhong.Yl
 * 2024/4/9 18:57
 * java_xuexi
 */
/*
* jdk提供的自动装箱，自动拆箱功能后，大大简化了基本数据类型和包装类之间的转换
* 值得注意的是：自动装箱和自动拆箱必须注意类型匹配
* */
public class AutoBoxingUnboxing {
    public static void main(String[] args){
        //将基本类型变量赋值给Integer类型
        Integer intNum = 3;
        //将boolean类型赋值给Object类型
        Object object = true;
        //将Integer类型赋值给int
        int a = intNum;
    }
}
