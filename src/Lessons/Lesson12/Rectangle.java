package Lessons.Lesson12;

public class Rectangle extends Shape{
    int a,b,c;

    public Rectangle(String color, int a, int b, int c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    void draw() {
        System.out.println("Rectangle");
    }
}
