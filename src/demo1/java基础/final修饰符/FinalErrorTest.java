package demo1.java基础.final修饰符;

/**
 * @author Zhong.Yl
 * 2024/4/10 10:04
 * java_xuexi
 */
public class FinalErrorTest {
    //定义一个final成员变量
    final int a;
    //初始化块
    {
        //没有初始化，直接打印
       // System.out.println(a);这里出现错误
        //使用方法来调用成员变量
        getFinalA();
        //进行初始化
        a = 11;
    }

       public void getFinalA(){
        //创建getFinalA方法
            System.out.println(a);
        }
        public static void main(String[] args){
        //这里需要new一下，才会执行构造器
        FinalErrorTest fin = new FinalErrorTest();
            System.out.println(fin.a);
        }
}
