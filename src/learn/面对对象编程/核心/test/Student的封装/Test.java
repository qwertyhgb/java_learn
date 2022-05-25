package learn.面对对象编程.核心.test.Student的封装;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        student.setStudentno(123456789);
        student.setName("张三");
        student.setSex("男");
        student.setPlace("安徽");
        student.setPhone("母亲:13857639008");
        System.out.println("学生信息如下:");
        System.out.println("-----------------");
        System.out.println("学号:" + student.getStudentno());
        System.out.println("姓名:" + student.getName());
        System.out.println("性别:" + student.getSex());
        System.out.println("地址:" + student.getPlace());
        System.out.println("母亲号码" + student.getPhone());
        student.setPhone("父亲:10398473667");
        System.out.println("父亲号码" + student.getPhone());
    }
}
