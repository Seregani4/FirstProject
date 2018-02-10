package Lessons.Lesson12;

public class Circle extends Shape{
    int a,b,c,d;

    public Circle(String color, int a, int b, int c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;

    }

    @Override
    void draw() {
        System.out.println("Circle");

    }
}
