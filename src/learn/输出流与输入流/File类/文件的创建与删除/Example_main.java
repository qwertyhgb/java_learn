package learn.输出流与输入流.File类.文件的创建与删除;

import java.io.File;
import java.io.IOException;

public class Example_main {
    public static void main(String[] args) throws IOException {
        File file1 = new File("D:\\文件\\项目文件\\java_learn\\file", "2.txt");
        File file2 = new File("D:\\文件\\项目文件\\java_learn\\file", "3.java");
        file1.createNewFile();
        file2.createNewFile();
        file2.delete();
    }
}
