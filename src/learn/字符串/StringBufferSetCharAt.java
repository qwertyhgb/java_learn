package learn.字符串;

public class StringBufferSetCharAt {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("189344858397");
        for (int i=3; i<=6; i++){
            stringBuffer.setCharAt(i, 'x');
        }
        System.out.println("号码是:" + stringBuffer);
    }
}
