package demo1.java基础.内部类;

/**
 * @author Zhong.Yl
 * 2024/4/10 15:33
 * java_xuexi
 */
interface Product{
    public double getPrice();
    public String getName();
}
public class AnonyMousTest {
    public void test(Product p){
        System.out.println("购买了一个：" + p.getName() + "花了："+ p.getPrice());
    }
    public static void main(String[] args){
        AnonyMousTest ta = new AnonyMousTest();
        //调用test方法时需要传入一个Product类型的参数
        //此处传入其匿名实现类的实例
        ta.test(new Product()
                {
                    public double getPrice(){
                        return 21;
                    }
                    public String getName(){
                        return "小米";
                    }
                });

    }
}
