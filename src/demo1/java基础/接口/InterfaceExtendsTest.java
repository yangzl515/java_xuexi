package demo1.java基础.接口;

/**
 * @author Zhong.Yl
 * 2024/4/10 14:08
 * java_xuexi
 */
//接口的继承
interface InterfaceA{
    int PORT_A = 5;
    void testA();
}
interface InterfaceB{
    int PORT_B = 43;
    void testB();
}
interface InterfaceC extends InterfaceA, InterfaceB{
    //InterfaceC继承了InterfaceA,InterfaceB,所以得到了他们两个的常量
    int PORT_C = 32;
    void testC();
}
public interface InterfaceExtendsTest {
    public static void main(String[] args){
        System.out.println(InterfaceC.PORT_A);
        System.out.println(InterfaceC.PORT_B);
        System.out.println(InterfaceC.PORT_C);
    }
}
