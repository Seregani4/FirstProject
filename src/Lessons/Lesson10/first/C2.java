package Lessons.Lesson10.first;

public class C2 extends C1 {
    @Override //Анотация для того что бв он мог точно сказать что он видит и оверрайдит метод указаный
    void m() {
        System.out.println("2");
    }
}
