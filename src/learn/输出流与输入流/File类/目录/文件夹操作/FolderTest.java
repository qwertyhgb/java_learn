package learn.输出流与输入流.File类.目录.文件夹操作;

import java.io.File;

public class FolderTest {
    public static void main(String[] args) {
        String path = "D:\\文件\\项目文件\\java_learn\\file";
        for (int i = 1; i <= 10; i++) {
            File folder = new File(path + "\\" + i);
            if (!folder.exists()) {
                folder.mkdir();
            }
        }
        System.out.println("文件夹创建称成功！");
        File file = new File("D:\\文件\\项目文件\\java_learn\\file");
        File[] files = file.listFiles();
        for (File file2 : files) {
            if (file2.isFile()) {
                System.out.println(file2.getName() + "文件");
            } else if (file2.isDirectory()) {
                System.out.println(file2.getName() + "文件夹");
            }
        }
    }
}
