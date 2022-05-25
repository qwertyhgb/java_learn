package learn.内部类_匿名类等.异常类;

import java.util.Scanner;

public class Tomato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("今天的西红柿的单价是:");
        String dayPrice = scanner.next();
        if (dayPrice.length() == 4) {
            try {
                String message = "西红柿:" + dayPrice + "元/500克";
                String[] strArr = message.split(":");
                String unitPriceStr = strArr[2].substring(0, 4);
                double weight = 650;
                double unitPriceDou = Double.parseDouble(unitPriceStr);  // 将String类型的单价转换为double类型
                System.out.println(message + ",顾客购买了" + weight + "克西红柿,需支付" + (float) (weight / 500 * unitPriceDou));
            } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                arrayIndexOutOfBoundsException.printStackTrace();
            } catch (Exception exception) {
                exception.getMessage();
            } finally {
                scanner.close();
                System.out.println("控制台输入对象先关闭.");
            }
        } else {
            System.out.println("违规操作，请重新输入:");
        }
    }
}
