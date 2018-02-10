package Lessons.Lesson13;

@FunctionalInterface
public interface IA {
    int a=10;
    int c=100;
    static void m(){
        System.out.println("hello from static method interface");
    }

    void m1();
    default void m2(){


    }

    class c1{}
    interface C2{}



}