package Lessons.Lesson11;

public class Main11 implements Cloneable {
    static int a;
    final int A = 12;
    int y;
    int x;

    public Main11(int x, int y) {
        this.x = x;
        this.y = y;
    }

    static void c() {
        System.out.println("static");
    }

    public static void main(String[] args) throws InterruptedException, CloneNotSupportedException {

        final Main11 main11 = new Main11(10, 23);
        main11.x = 100;
        System.out.println("point = " + main11);
        Main11 main111 = new Main11(10, 23);
        System.out.println(main11);
        System.out.println(main111.toString());
        System.out.println(main11.equals(main111));
        System.out.println(main11.hashCode());
        System.out.println(main111.hashCode());
        Main11 main112 = (Main11) main111.clone();
        System.out.println(main112.getClass() == Main11.class); // обьяснить строчку, разобрать сравнение //проверяет принадлежность класа к другому

        //самый яркий пример файнал класа это String

        System.out.println("main112 = " + main112.a);
        main11.c();
        

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Main11 main11 = (Main11) o;

        if (x != main11.x) return false;
        return y == main11.y;
    }

    void m() {
        //файнал метот невозможно переопределять
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }

    @Override
    public String toString() {
        return "Main11{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

}
