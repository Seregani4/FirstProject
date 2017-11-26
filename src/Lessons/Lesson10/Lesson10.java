package Lessons.Lesson10;

import Lessons.Lesson9.Girl;

public class Lesson10 {

/*    // Возвращение обьекиа
    class Test {
        int a;

        Test(int i) {
            a = i;
        }

        Test incrByTen() {
            Test temp = new Test(a + 10);
            return temp;
        }
    }

    class RetOb {
    public static void main(String args[]) {
        Test ob1 = new Test(2);
        Test ob2;

        ob2 = ob1.incrByTen();
        System.out.println("ob1.a:"+ ob1.a);
        System.out.println("ob2.a:"+ ob2.a);

        ob2 = ob2.incrByTen();
        System.out.println("ob2.a after second increase:"+ ob2.a);
    }
    }
}*/



    public static void main(String[] args) {
        Student student = new Student("Den", 22);
        System.out.println(student);
        Aspirant aspirant = new Aspirant("Alex", 24, "aaa");
        System.out.println(aspirant);


    }


}

