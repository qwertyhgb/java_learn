package learn.输出流与输入流.File类.文件的创建与删除;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Example_main2 {
    public static void main(String[] args) {
        File file = new File("D:\\文件\\项目文件\\java_learn\\file","test.txt");
        if (!file.exists()) {
            System.out.println("为在指定文件夹下找到test.txt文件,正在创建...");
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println("文件创建成功！");
        } else {
            System.out.println("找到了名字为test.txt的文件!");
            String filename = file.getName();
            String filepath = file.getPath();
            boolean hidden = file.isHidden();
            long len = file.length();
            long tempTime = file.lastModified();  //获取文件最后修改的时间
            // 创建SimpleDataFormat对象，指定目标格式
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Date date = new Date(tempTime);
            String time = simpleDateFormat.format(date);
            System.out.println("文件名:" + filename);
            System.out.println("文件的绝对路径:" + filepath);
            System.out.println("文件是否是隐藏文件:" + hidden);
            System.out.println("文件的长度:" + len);
            System.out.println("文件最后在修改的时间:" + time);
            file.delete();
            System.out.println("文件的价值没有了，已经被删除了！");
        }
    }
}
