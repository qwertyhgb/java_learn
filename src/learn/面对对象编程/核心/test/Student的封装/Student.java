package learn.面对对象编程.核心.test.Student的封装;

public class Student {
    private int studentno;
    private String name;
    private String sex;
    private String place;
    private String phone;

    public void setStudentno(int studentno) {
        this.studentno = studentno;
    }

    public int getStudentno() {
        return studentno;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getPlace() {
        return place;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }
}
