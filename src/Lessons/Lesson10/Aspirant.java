package Lessons.Lesson10;

public class Aspirant extends Student {
    String work;

    public Aspirant(String name, int age, String work) {
        super(name, age);
        this.work = work;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    @Override
    public String toString() {
        return "Aspirant{" +
                "work='" + work + '\'' +
                "} " + super.toString();
    }
}
