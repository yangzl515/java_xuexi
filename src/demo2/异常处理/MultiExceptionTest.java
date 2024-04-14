package demo2.异常处理;

/**
 * @author Zhong.Yl
 * 2024/4/12 8:53
 * java_xuexi
 */
public class MultiExceptionTest {
    public static void main(String[] args){
        try{
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int c = a / b;
            System.out.println("两数相除：" + c);
        }catch(IndexOutOfBoundsException | ArithmeticException | NumberFormatException e){
            System.out.println("程序出现数组下标越界，算术异常，数字类型异常之一");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }catch(Exception e){
            System.out.println("未知异常");

        }
    }
}
