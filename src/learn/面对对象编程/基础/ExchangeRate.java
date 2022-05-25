package learn.面对对象编程.基础;

public class ExchangeRate {
    public static void main(String[] args) {
        double[] i = {1, 5, 10, 20};
        System.out.println("美元为:");
        for (int j=0; j<i.length; j++) {
            System.out.print(i[j] + "美元");
        }
        ExchangeRate ex = new ExchangeRate();
        ex.change(i);
        System.out.println("");
        System.out.println("人民币:");
        for (int j=0; j<i.length; j++) {
            System.out.print(i[j] + "元");
        }
    }
    public void change(double[] i) {
        for (int j=0; j<i.length; j++) {
            i[j] = i[j] * 6.903;
        }
    }
}
