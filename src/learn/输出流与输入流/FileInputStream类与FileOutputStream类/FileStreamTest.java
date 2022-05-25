package learn.输出流与输入流.FileInputStream类与FileOutputStream类;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamTest {
    public static void main(String[] args) {
        File file = new File("D:\\文件\\项目文件\\java_learn\\file", "word.txt");
        try {
            // 创建FileOutputStream对象，用来向文件写入数据
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            String content = "你见过凌晨四点的洛杉矶吗?";
            // 创建byte型数组，将写入文件的内容转为字节数组
            byte[] buy = content.getBytes();
            fileOutputStream.write(buy); // 写入文件
            fileOutputStream.close();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        try {
            // 创建FIleInputStream对象来读取文件内容
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] byt = new byte[1024];
            int len = fileInputStream.read(byt);
            System.out.println("文件的内容是:" + new String(byt, 0, len));
            fileInputStream.close();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
