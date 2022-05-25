package learn.面对对象编程.核心;


public class Restaurant {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        System.out.println("来一个鱼香肉丝！");
        restaurant.takeOrder("鱼香肉丝");
        System.out.println("菜很好吃，请问你们的厨师叫什么名字？");
        System.out.println(restaurant.saySorry());
    }
    private Cook cook = new Cook();
    // 下单
    public void takeOrder(String dish) {
        cook.cooking(dish);
        System.out.println("你的菜好了，请慢用！");
    }
    public String saySorry() {
        return "抱歉，我们餐厅不提供此服务。";
    }
    // 内部类
    class Cook {
        private String name;
        public Cook() {
            this.name = "Tom Cruise";
        }
        private void cutOnion() {
            System.out.println(name + "切葱花");
        }
        public void washVegetavles() {
            System.out.println(name + "洗蔬菜");
        }
        void cooking(String dish) {
            washVegetavles();
            cutOnion();
            System.out.println(name + "开始烹饪" + dish);
        }
    }
}
