package dome3.IO流;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Zhong.Yl
 * 2024/4/13 16:44
 * java_xuexi
 */
public class FileWriterTest {
    public static void main(String[] args){
        try(
                FileWriter fw = new FileWriter("FileWriterTest.txt"))
        {
            fw.write("好\n");
            fw.write("好好\n");
            fw.write("好好好\n");
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
