package demo1.java基础.final修饰符;

/**
 * @author Zhong.Yl
 * 2024/4/10 9:30
 * java_xuexi
 */
public class FinalVariableTest {
    //指定成员变量值，合法
    final int a = 11;
    //下面变量将在构造器或初始化块中分配初始值
    final String set;
    final int b;
    //用来测试方法中初始化e
    //final int e;
    final static double d;
    //初始化块可对没有默认值的实例变量进行初始化
    {
        set = "yang";
    }

    //静态初始化块
    static
    {
        d = 3.2;
    }
    public FinalVariableTest(){
        //构造器可对既没有指定默认值，由没有在初始化块中指定初始值的的实例变量初始化
        b = 21;
    }

    public void Change(){
        //普通方法不能为final修饰变量赋值
       // e = 32;
    }

    public static void main(String[] args){
        FinalVariableTest fin = new FinalVariableTest();
        System.out.println(fin.set);
        System.out.println(fin.d);
        System.out.println(fin.b);
    }
}