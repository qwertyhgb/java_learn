package learn.面对对象编程.核心.对象的上转型对象;

public class People extends Anthropoid {
    char m = 'A';
    int n = 60;
    void computer(int a, int b) {
        int c = a+b;
        System.out.println(a + "加" + b + "等于" + c);
    }

    @Override
    void crySpeak() {
        System.out.println(m + "**" + "i love this game" + "**" + m);
    }
}
