package Lessons.Lesson12;

public class Main {
    public static void main(String[] args) {


/*        System.out.println(A.a);
        new A().n();
        A.m();
*/
/*        System.out.println(B.a=1000); // определили статическую переменную через наследника и дальше он будет измененый
        B.m();
        System.out.println(A.a);*/

        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle("red",1,2,3);
        shapes[1] = new Rectangle("blue",1,2,3);
        shapes[2] = new Circle("red1",1,2,3);
        for (Shape shape: shapes) {
            shape.draw();

        }


    }
}
