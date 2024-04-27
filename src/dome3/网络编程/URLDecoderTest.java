package dome3.网络编程;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * @author Zhong.Yl
 * 2024/4/24 9:50
 * java_xuexi
 */
public class URLDecoderTest {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //将 application/x-www-form-urlencoded MIME 字符串转换成普通字符串
        String keyWord = URLDecoder.decode("%E7%96%AF%E7%8B%82java","utf-8");
        System.out.println(keyWord);
        //将普通字符串转换为 application/x-www-form-urlencoded MIME 字符串
        String urlStr = URLEncoder.encode("疯狂java", "GBK");
        System.out.println(urlStr);
    }
}
