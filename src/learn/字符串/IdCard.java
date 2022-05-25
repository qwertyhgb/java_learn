package learn.字符串;

public class IdCard {
    public static void main(String[] args) {
        String idNum = "123456198002157890";
        String year = idNum.substring(6, 10);
        String month = idNum.substring(10, 12);
        String day = idNum.substring(12, 14);
        System.out.println("出生日期为:" + year + "年" + month + "月" + day + "日");
    }
}
