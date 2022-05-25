package learn.输出流与输入流.File类.目录;

import java.io.File;
import java.io.FilenameFilter;

public class FileAccpet implements FilenameFilter {
    private String extendName;
    public void setExtendName(String s) {
        extendName = "." + s;
    }

    @Override
    public boolean accept(File dir, String name) {  //重写接口FilenameFilter中的方法
        return name.endsWith(extendName);
    }
}
