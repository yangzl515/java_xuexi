package demo1.java基础.Class;

/**
 * @author Zhong.Yl
 * 2024/4/6 14:11
 * java_xuexi
 */
public class ConstructorTest {
    public int age;
    public String name;
    public ConstructorTest(int age, String name){
        this.age = age;
        this.name = name;
    }
public static void main(String[] args){
        ConstructorTest per = new ConstructorTest(11,"yang");
        System.out.println("年龄："+per.age  +  "  姓名："+per.name);
}
}

