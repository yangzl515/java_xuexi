package dome3.IO流;

/**
 * @author Zhong.Yl
 * 2024/4/14 11:44
 * java_xuexi
 */
public class Person implements java.io.Serializable{
    private String name;
    private transient int age;
    //注意此处没有提供无参数的构造器
    public Person(String name, int age){
        System.out.println("有参数的构造器");
        this.name  = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
