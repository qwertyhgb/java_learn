package learn.输出流与输入流.File类.目录;

import java.io.File;

public class Example_main {
    public static void main(String[] args) {
        File dir = new File(".");
        FileAccpet fileAccpet = new FileAccpet();
        fileAccpet.setExtendName("java");
        String[] filename = dir.list(fileAccpet);
        assert filename != null;
        for (String name:filename) {
            System.out.println(name);
        }
    }
}
