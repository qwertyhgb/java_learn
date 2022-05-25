package learn.面对对象编程.核心.对象的上转型对象;

public class Example {
    public static void main(String[] args) {
        People people = new People();
        People monkey = new People();
        monkey.crySpeak();  //此时调用的是继承重写的方法
//        monkey.n = 100; 无法调用子类新增的变量
//       monkey.computer(12, 19);  无法调用子类新增的方法
        System.out.println(monkey.m);
        System.out.println(people.m);
        monkey.computer(55, 33);
        monkey.m = 'T';
        System.out.println(monkey.m);
    }
}
