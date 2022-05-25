package learn.内部类_匿名类等.内部类;

public class Example_main {
    public static void main(String[] args) {
        RedCowFarm redCowFarm = new RedCowFarm("红牛农场");
        redCowFarm.showCowMess();
        redCowFarm.redCow.speak();
        RedCowFarm.RedCow redCow = new RedCowFarm.RedCow(180,114,435435);
        redCow.speak();
    }
}
