package learn.内部类_匿名类等.匿名类;

abstract class Speak {
    public abstract void speakHello();
}
class Student {
    void f(Speak speak) {
        speak.speakHello();
    }
}

public  class Example_main {
    public static void main(String[] args) {
        Speak speak = new Speak() {
            @Override
            public void speakHello() {
                System.out.println("Hello");
            }
        };
        speak.speakHello();
        Student student = new Student();
        student.f(new Speak() {
            @Override
            public void speakHello() {
                System.out.println("I am a student,hello!");
            }
        });
    }
}
