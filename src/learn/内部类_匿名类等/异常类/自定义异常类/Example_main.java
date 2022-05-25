package learn.内部类_匿名类等.异常类.自定义异常类;

public class Example_main {
    public static void main(String[] args) {
        People zhang = new People(), wang = new People();
        try {
            wang.setAge(180);
            System.out.println(wang.getAge());
        } catch(IntegerException integerException) {
            integerException.toString();
        }
        try {
            zhang.setAge(34);
            System.out.println(zhang.getAge());
        } catch (IntegerException integerException) {
            integerException.toString();
        }
    }
}
