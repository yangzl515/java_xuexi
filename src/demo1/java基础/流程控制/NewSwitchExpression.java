package demo1.java基础.流程控制;

/**
 * @author Zhong.Yl
 * 2024/4/5 14:41
 * java_xuexi
 */
public class NewSwitchExpression {
    public static void main(String[] args){
        char score = 'B';
        String judge = switch (score)
                {
                    case 'A','B' -> "成绩还不错";
                    case 'C','D' -> "成绩不足";
                    default -> "成绩输入错误";
                };
        System.out.println(judge);
    }
}
