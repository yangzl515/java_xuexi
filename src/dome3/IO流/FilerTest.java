package dome3.IO流;

import java.io.FileInputStream;
import java.io.ObjectInputFilter;
import java.io.ObjectInputStream;

/**
 * @author Zhong.Yl
 * 2024/4/14 12:25
 * java_xuexi
 */
public class FilerTest {
    public static void main(String[] args)
    {
        try(
                //创建一个ObjectInputStream输入流
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.txt")))
        {
            ois.setObjectInputFilter((info) ->
            {
                System.out.println("===执行数据过滤===");
                ObjectInputFilter serialFilter = ObjectInputFilter.Config.getSerialFilter();
                if(serialFilter != null)
                {
                    //首先使用ObjectInputFilter执行默认的检查
                    ObjectInputFilter.Status status = serialFilter.checkInput(info);
                    //如果检查的结果不是Status.UNDECIDED
                    if(status != ObjectInputFilter.Status.UNDECIDED){
                        //直接返回检查结果
                        return status;
                    }
                }
                //如果要恢复的对象不是1个
            if(info.references() != 1)
            {
                //不允许恢复对象
                return ObjectInputFilter.Status.REJECTED;
            }
            if(info.serialClass() != null && info.serialClass() != Person.class)
            {
                //不允许恢复对象
                return ObjectInputFilter.Status.REJECTED;
            }
            return ObjectInputFilter.Status.UNDECIDED;
        });
        //从输入流中读取一个 Java对象，并将其强制类型转换为Person类
            Person p = (Person)ois.readObject();
            System.out.println("名字：" + p.getName() + "\n年龄：" + p.getAge());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
