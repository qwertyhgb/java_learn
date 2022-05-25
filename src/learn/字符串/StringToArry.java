package learn.字符串;
/**
 * 把一个字符串转换为一个字符数组
 */
public class StringToArry {
    public static void main(String[] args) {
        String str = "这是一个字符串";
        char[] ch = str.toCharArray();
        for (int i=0; i<ch.length; i++){
            System.out.println("数组中第" + (i+1) + "个元素为:" + ch[i]);
        }
    }
}
