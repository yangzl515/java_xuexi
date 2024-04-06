package demo1.java基础.Class;

/**
 * @author Zhong.Yl
 * 2024/4/6 13:42
 * java_xuexi
 */
public class ClassTest {
    public static void main(String[] args){
        //创建一个Person类型的变量
        Person per;
        //将该Person赋值给per变量
        per = new Person();
        //访问per的name的实例变量，并为该变量赋值
        per.age = 11;
        per.name = "yang";
        per.info();
    }
}
