package learn.输出流与输入流.File类.运行可执行文件;

import java.io.File;
import java.io.IOException;

public class Example_main {
    public static void main(String[] args) {
        try {
            Runtime ce = Runtime.getRuntime();
            File file = new File("D:\\文件\\项目文件\\java_learn", "Notepad.exe");
            ce.exec("txt 1.txt");
            ce.exec(file.getAbsolutePath());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
