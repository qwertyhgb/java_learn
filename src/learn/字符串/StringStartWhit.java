package learn.字符串;

public class StringStartWhit {
    public static void main(String[] args) {
        // 家具电器种类数组
        String applinaces[] = {"美得电磁炉","海尔冰箱","格力空调","小米手机","海尔洗衣机","美的吸尘器","格力手机","海尔电热水器","海信液晶电视"};
        int sum = 0;
        for (int i=0; i<applinaces.length; i++){
            String name = applinaces[i];
            if (name.startsWith("海尔")){
                sum++;
            }
        }
        System.out.println("海尔电器一共有" + sum + "种。");
    }
}
