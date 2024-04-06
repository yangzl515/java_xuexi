package demo1.java基础.流程控制;

/**
 * @author Zhong.Yl
 * 2024/4/5 14:51
 * java_xuexi
 */
public class NewSwitchExpression1 {
    public static void main(String[] args){
        char score = 'B';
        String judge = switch (score)
                {
                    case 'A','B' -> {
                        System.out.println("成绩还不错");
                        yield "优秀";
                    }
                    case 'C','D' -> {
                        System.out.println("成绩不足");
                        yield "不足";
                    }
                    default -> "成绩输入错误";
                };
        System.out.println(judge);
    }
}
