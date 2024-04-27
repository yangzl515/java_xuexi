package dome3.网络编程;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author Zhong.Yl
 * 2024/4/24 8:56
 * java_xuexi
 */
public class InetAddressTest {
    public static void main(String[] args) throws Exception {
        //根据主机名来获取对应的 InetAddress 实例
        InetAddress ip = InetAddress.getByName("www.crazyit.org");
        //判断是否可以到达
        System.out.println("crazyit是否可以到达：" + ip.isReachable(2000));
        //获取该 InetAddress 实例的 IP 字符串
        System.out.println("IP字符串：" + ip.getHostAddress());
        //根据原始 IP 地址来获取对应的 InetAddress 实例
        InetAddress local = InetAddress.getByAddress(new byte[] {127,0,0,1});
        System.out.println("本机是否可以到达：" + local.isReachable(5000));
        //获取该 InetAddress实例对应的全限定域名
        System.out.println(local.getCanonicalHostName());
    }
}
