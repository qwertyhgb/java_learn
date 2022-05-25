package learn.面对对象编程.核心.object类;

public class OverWriteEquals {
    public static void main(String[] args) {
        String s1 = new String("123");
        String s2 = new String("123");
        System.out.println(s1.equals(s2));
        V v1 = new V();
        V v2 = new V();
        System.out.println(v1.equals(v2));    
    }
}

class V {

}