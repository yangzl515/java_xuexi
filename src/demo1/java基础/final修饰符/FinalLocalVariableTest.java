package demo1.java基础.final修饰符;

/**
 * @author Zhong.Yl
 * 2024/4/10 10:20
 * java_xuexi
 */
public class FinalLocalVariableTest {
    public void FinalTest(final int a){
        //不能对final修饰的形参赋值，下面语句是错误的
        //a = 33;
    }
    public static void main(String[] args){
        //对final修饰的变量赋值
        final String str = "123";
        //对已赋值的final变量再次赋值，出现错误
         //str = "211";    Cannot assign a value to final variable 'str'
    }
}
