package Lessons.Lesson13;

public class A extends A1 implements IA, IAIa {
    void n(){
        System.out.println("not static + A");
    }

    @Override
    public void m1(){
        throw new UnsupportedOperationException();
    }

    @Override
    public void m2() {
        IAIa.super.m2();
    }

}
