package demo1.java基础.接口;

/**
 * @author Zhong.Yl
 * 2024/4/10 11:15
 * java_xuexi
 */
public interface Output {
    //在接口里定义变量只能是常量
     int numInt = 21;
     //接口里定义的普通方法只能是public的抽象方法
    abstract void out();
    void getData(String msg);
    //在接口中需要定义默认方法，需要使用default修饰
    default void print(String... msgs){
        for (String msg : msgs){
            System.out.println(msg);
        }
    }
    default void test(){
        System.out.println("接口中默认方法");
    }
    //在接口中定义类方法，需要使用static修饰
    static String staticTest(){
        return "接口中的类方法";
    }
    //接口中的私有方法
    private void foo(){
        System.out.println("接口中的私有方法");
    }
    //接口中的私有静态方法
    private static void foo1(){
        System.out.println("接口中的私有静态方法");
    }
}
