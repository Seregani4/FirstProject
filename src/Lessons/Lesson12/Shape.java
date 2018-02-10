package Lessons.Lesson12;

public abstract class Shape {
    String color;

    public Shape(String color) {
        this.color = color;
    }

    abstract void draw();
}
