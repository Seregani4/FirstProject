package Lessons.Lessons19;

import java.io.IOException;
import java.util.Random;

public class main {
    public static void main(String args[]) {
        //ексепшены, исключительные ситуации

//        int a=0, b=0, c=0;
//        Random r = new Random();
//        for(int i=0; i<32000; i++)
//            try {
//                b=r.nextInt();
//                c=r.nextInt();
//                a= 12345/(b/c);
//            } catch (ArithmeticException e) {
//                System.out.println("Деление на ноль");
//                a=0;
//            }
//        System.out.println("a"+ a);

//        int a;
//        try {
//            a = args.length;
//            int b = 42 / a;
//            int[] c = new int[a];
//            c[a] = 666;
//        } catch (ArithmeticException e) {
//            System.out.println("Деление на ноль " + e);
//        } catch (ArrayIndexOutOfBoundsException e ){
//            e.printStackTrace();
//        }
//        System.out.println("Уже после блока try catch catch ");

//        try {
//            try {
//                throw new Exception("a");
//
//            } finally {
//                if (true)
//                    throw new IOException("b");
//
//            }
//            System.err.println("c");
//        }
//    }catch (IOException ex){
//        System.err.println(ex.getMessage());
//
    }
}
