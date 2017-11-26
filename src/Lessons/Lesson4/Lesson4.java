package Lessons.Lesson4;

import java.util.Scanner;

public class Lesson4 {
    public static void main(String[] args) {

//    int age = 10;
//    if(age>11)
//    {
//        System.out.println("age>10");
//    }else
//        {
//        System.out.println("hi");
//
//    }

//        int age = 1; // default - заканчиваеться
//        switch (age) {
//            case 1:
//                System.out.println("1");
//                break;
//            case 2:
//                System.out.println("2");
//                break;
//            case 3:
//                System.out.println("3");
//                break;
//                default:
//
//        }
//        System.out.println("hi");

//        int day = 7; //выполняеться в каждом кейсе, и идет до соат
//        switch (day) {
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("work");
//                break;
//            case 6:
//            case 7:
//                System.out.println("wekeend");
//                break;
//                default:
//
//        while (true) { //безконечный цикл без точки выхода
//            System.out.println("hi");
//        }

//        int i=0;
//        while (i<10) { //выводиться i до числа 10
//            System.out.println(i);
//            i++;
//        }

//        int i=10;
//        do {
//            System.out.println(i);
//        } while (i>10);

//        int i, j;
//        i = 100;
//        j = 200;
//        while(++i < --j); //find midpoint between i and j //щт среднее значение между двумя числами
//        System.out.println("midpoint is "+ j);

//        for (int i = 0; i < 10; i++) { //fori для цикла
//            System.out.println("i = " + i);
//
//        }

//                for (int i = 0; i < 10; i++,System.out.println("i = " + i)); //возможно написать в одну строчку пример который выше но это гулпо и не читаемо
//
//        int j = 0;
//        for (;;){ //хз так и не понял что это за ;;
//            System.out.println("j = " + j);
//            j++;
//            if (j>10)break;
//        }
//

//        for (int j = 0; j < 50; j++) { //выводим числа с 0 до 50 нечетные числа деления по модулю
//            if (j%2==1) {
//                System.out.println("j = " + j);
//            }
//        }
//
//        for (int a = 0; a >= 50; a++) { //еполучилось сделать хз что с вайлос
//            while (true) {
//                System.out.println("a = " + a);
//            }
//        }

//        int [] a={1, 2, 3, 4, 5, 6,}; //Квадратные скобки для множеств
//        for (int x:a) {
//            System.out.println("x = " + x);
//        }

//        for (int i = 0; i < 10; i++) {
//            if (i%2!=0)continue; //текущая итерация данного цикла заканчиваеться когда встречает континью и начинает цикл заново
//            System.out.println("i = " + i);
//        }

//        String strInt = "123"; String strDouble = "123.456"; //Парсинг инта в стренг и наоборот как я понял
//        int x; double y;
//        x = Integer.parseInt(strInt);
//        y = Double.parseDouble(strDouble);
//        System.out.println("x = " + x);
//        System.out.println("y = " + y);
//        strInt = String.valueOf(x+1);
//        strDouble = String.valueOf(y+1);
//        System.out.println("strInt = " + strInt);
//        System.out.println("strDouble = " + strDouble);
//        String str;
//        str = "num=" + 345;
//        System.out.println(str);

//        System.out.println(Integer.MAX_VALUE+1); //максимальное значение при плюсе одного уйдет в минимальеное значение
//        System.out.println(Integer.MAX_VALUE+Integer.MIN_VALUE); // Равняеться нулю

//        System.out.println(Integer.toString(262));
//        System.out.println(Integer.toBinaryString(262));
//        System.out.println(Integer.toHexString(267));
//        System.out.println(Integer.toOctalString(267));
//        System.out.println(Integer.toUnsignedString(267));

        //задачи с домашки  делать с помощью Scanner
        Scanner scanner = new Scanner(System.in);//это указание консоли систем иен
        String [] split = scanner.nextLine().split(" ");
        int i = Integer.parseInt(split[0]);
        int a = Integer.parseInt(split[1]);
        int b = Integer.parseInt(split[2]);
        int c = Integer.parseInt(split[3]);
        System.out.println(i+1);
        System.out.println(a+1);
        System.out.println(b+1);
        System.out.println(c+1);


    }
}

