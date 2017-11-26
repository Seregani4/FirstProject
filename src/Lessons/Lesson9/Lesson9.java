package Lessons.Lesson9;

class Test {




/*
    int a;
    int b;

    public Test(int a, int b) {
        this.a = a; //ссылаемся а=а а которая ввыше в класе а новая а
        this.b = b; //ссылка на обьект в рамках этого класса

    }

    void s(int a, int b) {
        a += 20;
        b += 15;
    }

    void s(Test a) {
        a.a += 20;
        a.b += 15;
    }
*/

}


public class Lesson9 {
    public Lesson9()
    {

        System.out.println("hi");

    }

/*    public static void main(String[] args) {


        Girl ira = new Girl("ira", 20);
        Girl ket = new Girl("ket", 20);

        Test test = new Test(10, 20);
        int a = 10;
        int b = 20;
        test.s(a, b);
        System.out.println("a = " + a); //10
        System.out.println("b = " + b); //20
        test.s(test);
        System.out.println("test a= " + test.a);//30
        System.out.println("test b= " + test.b);//35
    }
}*/

    public static void main(String[] args) {

        Girl ira = new Girl("ira", 20);
        Girl ket = new Girl("ket", 20);
        System.gc();

    }
}

//    static int m(int a, int b) { //значемый тип передачи значения
//        return a + b;
//    }

//    static int m(String s, int... a) { //передаеится любое количество интов
//        System.out.println("s = " + s);
//        s += "aaa";
//        System.out.println("s = " + s);
//        int sum = 0;
//        for (int i : a) {
//            sum += i;
//        }
//        return sum;
//    }

//    public static void main(String[] args) { //любой ссылочный тип с файнол типом нельзя исправлять, такой как стринг
//        //писать файнал инт это глупость так как инт могу изменить
//
//        final String S1 = "aaaaaaa";
//        final int[] ARR = {1, 2, 3, 4, 5, 6};
//        System.out.println(S1);
//        System.out.println(Arrays.toString(ARR));
//        ARR[0]=100000;
//        System.out.println(Arrays.toString(ARR));
//
//
//        String s = "ASD";
//        System.out.println(s);//ASD
//        int i = m(s, 11, 12, 123, 14, 123, 123, 1245, 123, 51, 34, 1234, 12);
//        System.out.println("i = " + i);
//        System.out.println(s);//ASD
//        Girl ira = new Girl("Ira", 23);
//        ira.goToCinema();
//        System.out.println(ira);
//        System.out.println(ira.goToRest("Mac"));




