package demo1.java基础.包装类;

/**
 * @author Zhong.Yl
 * 2024/4/9 19:45
 * java_xuexi
 */ class Preson{
    private String name;
    public Preson(String name){
        this.name = name;
    }
}


public class PrintObject {
    public static void main(String[] args){
    Preson pre1 = new Preson("yang");
    System.out.println(pre1);
    System.out.println(pre1.toString());

    }
}
