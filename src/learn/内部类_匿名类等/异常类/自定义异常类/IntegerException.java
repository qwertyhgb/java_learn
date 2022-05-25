package learn.内部类_匿名类等.异常类.自定义异常类;

public class IntegerException extends Exception {
    String message;
    public IntegerException(int m) {
        message = "年龄" + m + "不合理";
    }
    public String toString() {
        return message;
    }
}
