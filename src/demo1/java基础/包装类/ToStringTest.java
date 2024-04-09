package demo1.java基础.包装类;


class Apple{
    private String name;
    private int weight;
    public Apple(String name, int weight){
        this.name = name;
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }

    public String getName() {
        return name;
    }
    public int getWeight(){
        return weight;
    }

    public String toString(){
        return "名字是：" + name + "重量是：" + weight;
    }
}
public class ToStringTest {
    public static void main(String[] args){
        Apple apple = new Apple("苹果",12);
        System.out.println(apple);
    }
}
