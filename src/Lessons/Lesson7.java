package Lessons;

import java.util.Arrays;

public class Lesson7 {
    public static void main(String[] args) {
/*        int a = 10;
        int[] b;
        b = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        // int[] b = {10}; //указывваетсья на множество в котором находиться 10
        int[] c = new int[8];*/
//       System.out.println(c.toString()); //ти собачка и код в 16ти ричном значении [I@1540e19d
//
////Вариант вывода масива через fori будет переберать всю длину масива и будет его переводить
//        for (int i = 0; i < c.length; i++) {
//            System.out.println(c[i]);
//        }
////вариант вывода масива через foreach иксу даеться каждый раз значение с
//        for (int x:c) {
//            System.out.println(x);
//        }

/*        Arrays.stream(b)  //обьект на котором мы можем выбрать набор действий по работе с текущим действием
                .filter(s -> s % 2 == 0)
                .map(s -> s * 2)
                .map(s -> s / 3)
                .sorted()
                .forEach(System.out::println);*/


/*        double[] array = Arrays.stream(b)
                .filter(s -> s % 2 == 0)
                .mapToDouble(s -> s * 2.5)
                .map(d -> d * 10)
                .sorted()
                .toArray();

        System.out.println(Arrays.toString(array));*/

/*        Object[] array1 = Arrays.stream(b) //преоброзование к стрингу
                .filter(s -> s % 2 == 0)
                .mapToObj(s ->String.valueOf(s))
                .toArray();

        System.out.println(Arrays.toString(array1));*/

/*
//двух мерный массив,
        int[][] b = {{10, 1, 2, 4},
                {20, 2, 3, 1}};
        System.out.println(Arrays.deepToString(b)); //выводит масив масивов
//двухмерный массив
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(b[i][j] + " ");
            }
            System.out.println();
        }
//вывод двухмерного масива
        for (int[] ints : b) {
            for (int anInt : ints) {
                System.out.println(anInt + " ");
            }
        }*/



        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9}; //перебирает полностью вексь масив и переворачиваеться на оборот
        int[] arr1 = {12, 23, 34, 45, 56, 76, 77, 58, 29};
        int[] data = {12, 23, 34, 45, 56, 76, 77, 58, 29}; //перебирает полностью вексь масив и переворачиваеться на оборот
        invertArr(arr); //кнтр+М выносит кусок кода в отдельный метод который потом можно вызывать в другом классе
        invertArr(arr1); //кнтр+М выносит кусок кода в отдельный метод который потом можно вызывать в другом классе

        bubblesort(data);
    }

    private static void bubblesort(int[] data) {//сортирует массив и вывод его от меньшего к большему
        for (int barrier = data.length -1 ; barrier >=0 ; barrier--) {
            for (int index = 0; index < barrier; index++) {
                if (data[index]>data[index+1]) {
                    int tmp = data[index];
                    data[index] = data[index + 1];
                    data[index+1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(data));
    }

    private static void invertArr(int[] arr) {
        System.out.println(Arrays.toString(arr));
        for (int k = 0; k < arr.length / 2; k++) {
            int tmp = arr[k];
            arr[k] = arr[arr.length - k - 1];
            arr[arr.length - k - 1] = tmp;
        }
        System.out.println(Arrays.toString(arr));
    }




    }

