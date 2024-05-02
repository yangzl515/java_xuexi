package hanshunping.avaj.demo01;

import java.util.Scanner;

/**
 * @author Zhong.Yl
 * 2024/5/2 12:25
 * java_xuexi
 */
public class ObjectTest {
    public static void main(String[] args) {
        Scanner sd = new Scanner(System.in);
        int n = 2 + 3;
        Person a = new Person();
        a.age = 11;
        a.name = "哈哈";
        Person b = new Person();
        b = a;
        System.out.println(b.name);
        b.age = 20;
        b = null;
        System.out.println(a.age);
        System.out.println(b.age);
    }
}

class Person {
    int age;
    String name;
}
class Persons {
}
