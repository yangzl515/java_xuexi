package demo1.java基础.接口;

/**
 * @author Zhong.Yl
 * 2024/4/10 14:25
 * java_xuexi
 */
//定义一个Product接口
interface Product{
    int getProduceTime();
}
//让Printer实现Output,Product
public  class Printer implements Output, Product{
    private String[] printData = new String[numInt];
    //用于记录当前需要打印额记录数
    private int dataNum = 0;

    @Override
    public void out(){
        while(dataNum > 0 ){
            System.out.println("打印:" + printData[0]);
            //把作业队列整体向前移动一位，作业书减一
            System.arraycopy(printData,1,printData,0, --dataNum);
        }
    }
    public void getData(String msg){
        if (dataNum >= numInt){
            System.out.println("输出队列已满，添加失败！");
        }
        else{
            //把打印数据添加到队列，已保存的数据加一
            printData[dataNum++] = msg;
        }
    }
    public static void main(String[] args){
        //创建一个Printer对象，把它当成Output使用
            Output o = new Printer();
        o.getData("羊羊羊");
        o.getData("哈哈哈");
        o.out();
        o.getData("嘿嘿嘿");
        o.getData("好好好");
        o.out();
        //调用Output接口中的默认方法
        o.print("1","2","3");
        o.test();
        Product p = new Printer();
        System.out.println(p.getProduceTime());
        //所有接口类型的引用类型变量，都可以直接赋值给Object类型的变量
        Object obj = p;

    }

    @Override
    public int getProduceTime() {
        return 0;
    }
}
