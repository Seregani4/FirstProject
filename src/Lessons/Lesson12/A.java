package Lessons.Lesson12;

public class A { // статику мы можем использовать везде, не статику только с не статитой
    static {
        System.out.println("static block");
    }
    static int a;
    int b;
    static void m(){
        //System.out.println("static A + "+a);

    }
    void n() {
        System.out.println("not static + "+a);
    }
}
