package dome3.IO流;

import java.io.IOException;
import java.io.ObjectOutput;

/**
 * @author Zhong.Yl
 * 2024/4/19 11:56
 * java_xuexi
 */
//另一种自定义序列化机制
public class Person01 implements java.io.Externalizable{
    private String name;
    private int age;
    public Person01(){}
    public Person01(String name, int age){
        System.out.println("有参数的构造器");
        this.name = name;
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

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        //将name实例变量值反转后写入二进制流
        out.writeObject(new StringBuffer(name).reverse());
        out.writeInt(age);
    }

    public void readExternal(java.io.ObjectInput in) throws IOException, ClassNotFoundException{
        //读取的字符串反转后赋给name实例变量
        this.name = ((StringBuffer)in.readObject()).reverse().toString();
        this.age = in.readInt();
    }
}
