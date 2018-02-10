package Lessons.Lesson13;

public class main {
    public static void main(String[] args) {
        A a = new A();
        a.n();
        a.m1();
        System.out.println(A.a); //доступ к переменной через класс
        IA.m(); //static метод увидем только через интерфейс
        a.m2(); // отрабатывает метот написанный в интерфейсе
        a.m1(); //используеться для методов которые не реализованы, для получения эксепшена

    }
}