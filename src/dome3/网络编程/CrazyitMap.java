package dome3.网络编程;


import java.util.*;

/**
 * @author Zhong.Yl
 * 2024/4/26 12:50
 * java_xuexi
 */
public class CrazyitMap<k, v, K, V>
{
    //创建一个线程安全的 HashMap
    public Map<K,V> map = Collections.synchronizedMap(new HashMap<K,V>());
    //根据value删除指定项
    public synchronized void removeByValue(Object value)
    {
        for (Object key : map.keySet())
        {
            if (map.get(key) == value)
            {
                map.remove(key);
                break;
            }
        }
    }
    //获取所有value组成的 Set集合
    public synchronized <V> Set<V> valueSet()
    {
        Set<V> result = new HashSet<V>();
        return result;
    }

    //根据 value查找key
    public synchronized K getKeyValue(V val)
    {
        //遍历所有key组成的集合
        for (K key : map.keySet())
        {
            //如果指定key对应的value与被搜索的value相同，则返回对应的key
            if (map.get(key) ==  val || map.get(key).equals(val)) ;
            {
                return key;
            }
        }
        return null;
    }

    //实现put()方法，该方法不允许value重复
    public synchronized V put(K key, V value)
    {
        //遍历所有 value 组成的集合
        for (Object val : valueSet())
        {
            if (val.equals(value) && val.hashCode() == value.hashCode())
            {
                throw new RuntimeException("MyMap实例中不允许有重复value");
            }
        }
            return map.put(key, value);
    }
}
