package learn.字符串;
/**
 * 运用indexOf方法判断字符串里是否有中文逗号
 */
public class StringIndexOf {
    public static void main(String[] args) {
        String str = "床前明月光， 疑是地上霜。";
        int charIndex = str.indexOf("，");  //返回搜索的字符或字符串在字符串中首次出现的索引位置，如果没有查找到则返回-1
        if (charIndex != -1){
            System.out.println("字符串中有中文逗号，位置是:" + charIndex);
        }
        else {
            System.out.println("字符串中没有中文逗号！！");
        }
    }
}
