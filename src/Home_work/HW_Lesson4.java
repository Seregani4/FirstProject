package Home_work;

import java.util.Scanner;

/**
 * Created by ddi-pc-41 on 11/6/17.
 */
public class HW_Lesson4 {
    public static void main(String[] args) {


//        task1();//Приветствовать любого пользователя при вводе его имени через командную строку.
//        task2(args);//Отобразить в окне консоли аргументы командной строки в обратном порядке.
//        task3();//Вывести заданное количество случайных чисел с переходом и без перехода на новую строку.
//        task4();//Ввести пароль из командной строки и сравнить его со строкой-образцом.
//        task5(args);//Ввести целые числа как аргументы командной строки, подсчитать их суммы (произведения) и вывести результат на консоль.
//// Ввести с консоли n целых чисел. На консоль вывести:
//        task61();// Четные и нечетные числа.
//        task62();// Наибольшее и наименьшее число.
//        task63();// Числа, которые делятся на 3 или на 9.
//        task64();// Числа, которые делятся на 5 и на 7.
//        task65();// Все трехзначные числа, в десятичной записи которых нет одинаковых цифр.
//        task66();// «Счастливые» числа.
        task67();// Элементы, которые равны полусумме соседних элементов.
    }

    private static void task1() {
        System.out.println("1. Приветствовать любого пользователя при вводе его имени через командную строку.");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Приветствую" + " " + name);

    }


    private static void task2(String[] args) {
        System.out.println("2. Отобразить в окне консоли аргументы командной строки в обратном порядке.");
        for (int i = args.length - 1; i >= 0; i--)
            System.out.println(args[i]);
    }

    private static void task3() {
        System.out.println("3. Вывести заданное количество случайных чисел с переходом и без перехода на новую строку.");
        int[] a = {10, 15, 20, 25, 30};
        String masiv = "";
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
            masiv += String.valueOf(a[i]) + " ";
        }
        System.out.print(masiv);
    }

    private static void task4() {
        System.out.println("4. Ввести пароль из командной строки и сравнить его со строкой-образцом.");
        Scanner scanner = new Scanner(System.in);
        String password = scanner.next();
        String currentpassword = "QWE123";
        boolean x = currentpassword.equals(password);
        System.out.println(x);
    }

    private static void task5(String[] args) {
        System.out.println("5. Ввести целые числа как аргументы командной строки, подсчитать их суммы (произведения) и вывести результат на консоль.");
        int summ = 0;
        int mult = 1;
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
            summ += Integer.valueOf(args[i]);
            mult *= Integer.valueOf(args[i]);
        }
        System.out.println("Сумма всех элементов = " + summ);
        System.out.println("Произведение всех елементов = " + mult);
    }


    private static void task61() {
        System.out.println("6.1. Четные и нечетные числа.");
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int number = scanner.nextInt();
            if (number % 2 == 0)
                System.out.println("Четное число " + number);
            else
                System.out.println("Не четное число " + number);
        }
    }

    private static void task62() {  //невыводить значения почемуто останавливаеться после выполнения вайла
        System.out.println("6.2. Наибольшее и наименьшее число.");
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split(" ");
        int max = Integer.valueOf(str[0]);
        int min = Integer.valueOf(str[0]);
        for (int i = 0; i < str.length; i++) {
            int a = Integer.valueOf(str[i]);
            //System.out.println(a); // выводит все введенные значения в столбик
            if (a >= max)
                max = a;
            if (a <= min)
                min = a;
        }
        System.out.println("Максимальное значение " + max);
        System.out.println("Минимальное значение " + min);
    }


    private static void task63() {
        System.out.println("6.3. Числа, которые делятся на 3 или на 9.");
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int number = scanner.nextInt();
            if (number % 3 == 0 || number % 9 == 0)
                System.out.println("Делиться на 3 или на 9 " + number);
        }
    }

    private static void task64() {
        System.out.println("6.4. Числа, которые делятся на 5 и на 7.");
        Scanner scanner = new Scanner(System.in);
        String[] results = scanner.nextLine().split(" ");
        for (int i = 0; i < results.length; i++) {
            int number = Integer.valueOf(results[i]);
            if (number % 5 == 0 && number % 7 == 0) {
                System.out.println("Число делиться на 5 и на 7 = " + number);
            }
        }
        System.out.println("Я перебрал все числа которые деляться на 5 и на 7 и вывел их выше");
    }

    private static void task65() {
        System.out.println("6.5. Все трехзначные числа, в десятичной записи которых нет одинаковых цифр.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите трехзначное число");
        while (scanner.hasNext()) {
            int a, b, c, d, e;
            a = scanner.nextInt();
            while (a < 100 || a > 999) {
                System.out.println("Ошибка, вы ввели не трехзначное число, повторите еще раз!");
            }
            b = a / 100; // количество сотен     //1
            c = a % 100; // десятки и еденицы
            d = c / 10;  // количество десяток   //23 /10 = 2
            e = c % 10;  // количество единиц    //3
            if (b == d && d == e)
                System.out.println("Все три цифры числа одинаковые");
            else if (b == d || d == e || b == e)
                System.out.println("Две цифры числа одинаковые");
            if (b != d && d != e && e != b)//можно было написать просто else но оставил фотмулу по поиску не совпадающих чисел
                System.out.println("Одинаковых цифр в числе нет");
        }
    }

    private static void task66() {
        System.out.println("6.6 «Счастливые» числа.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите четырёхзначное число");
        while (scanner.hasNext()) {
            int a, b, c, d, e, f, g;
            a = scanner.nextInt();
            while (a < 1000 || a > 9999) break;
            {
                System.out.println("Ошибка, вы ввели не четырёхзначное число, повторите еще раз!");
            }
            b = a / 100; // количество чисяч  //6473 / 100 = 64
            c = a % 100;  // количество сотен  //6473 % 100 = 73
            d = b / 10; // получаем первое число
            e = b % 10; // получаем второе число
            f = c / 10; // получаем третье число
            g = c % 10; // получаем четвертое число

            if (d + e == f + g) {
                System.out.println("Вы ввели счастливое число");
            }
            break;
        }
    }
    private static void task67(){
        System.out.println("Элементы, которые равны полусумме соседних элементов.");
        Scanner scanner = new Scanner(System.in);
        String[] result = scanner.nextLine().split(" ");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[0]);
        }
    }
}