package demo2.集合.Map;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Zhong.Yl
 * 2024/4/11 16:08
 * java_xuexi
 */
public class MapTest {
    public static void main(String[] args){
        Map map = new HashMap();
        //成对放入多个key-value对
        map.put("yang", 11);
        map.put("zhong",22);
        map.put("lin",33);
        System.out.println(map);//{lin=33, zhong=22, yang=11}
        map.put("lin",33);
        System.out.println(map);//{lin=33, zhong=22, yang=11}

        //key相同，新的value会覆盖原来的value
        map.put("lin",44);
        System.out.println(map);//{lin=44, zhong=22, yang=11}
        //key不相同，value会加入
        map.put("yzl",44);
        System.out.println(map);//{lin=44, zhong=22, yang=11, yzl=44}
        //判断是否含有value为22
        System.out.println(map.containsValue(22));//true
        //返回集合里的元素
        for (Object key : map.keySet()){
            System.out.println(key + "-->" + map.get(key));//map.get(key)返回key对应的value
        }
    }
}
