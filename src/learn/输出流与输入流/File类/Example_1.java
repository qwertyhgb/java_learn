package learn.输出流与输入流.File类;

import java.io.File;
import java.util.Arrays;

public class Example_1 {
    public static void main(String[] args) {
        String [] a;
        File[] b;
        // File f1 = new File("D:\\文件/项目文件/java_learn", "1.txt");
        File f2 = new File("D:\\文件/项目文件/java_learn");
        // System.out.println(f1.getName() + "是可读的吗？" + f1.canRead());
        // System.out.println(f1.getName() + "的长度" + f1.length());
        // System.out.println(f1.getName() + "的绝对路径:" + f1.getAbsolutePath());
        // System.out.println(f2.getName() + "是目录吗？" + f2.isDirectory());
        a = f2.list();
        b = f2.listFiles();  // 该方法的返回值是File对象形式
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
