package demo2.异常处理;

/**
 * @author Zhong.Yl
 * 2024/4/12 8:29
 * java_xuexi
 */
public class DivTest {
    public static void main(String[] args){
        try
        {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int c = a / b;
            System.out.println("你输入的两个数相除是" + c);
        }catch(IndexOutOfBoundsException e){
            System.out.println("数组越界：运行程序时，输入的参数个数不够");
        }catch(NumberFormatException e){
            System.out.println("数字格式异常：程序只能接受整型参数。");
        }catch(ArithmeticException e){
            System.out.println("算术异常");
        }catch(Exception e){
            System.out.println("未知异常");
        }
    }
}
