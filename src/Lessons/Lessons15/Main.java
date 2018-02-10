package Lessons.Lessons15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
//        Z.M.m();
//        TypeQuest unique = new TypeQuest(){
//        public void addNewType(){
//            System.out.println("123123123");
//        }
//};
//        unique.addNewType();
//
//        new TypeQuest(71){
//            private String name = "DranandDrop";
//            public void addNewype() {
//                System.out.println("123123");
//            }
//
//            public String getName() {
//                return name;
//            }
//        }.addNewType();
//
//        TypeQuest standart = new TypeQuest(35);
//        standart.addNewType();
//
//        Object o = new Object(){
//            @Override
//            public int hashCode() {
//                System.out.println("12312312");
//                return 100;
//            }
//        };
//        System.out.println(o.hashCode());

//
//        Function<String, String > a=(String x)->{return x+"aaaa";};
//        System.out.println(a.apply("ssssss"));

            //лясда с цепочкой

//        Stream.of("aaa", "daacc", "avvb","saddd")
//                .filter(x->x.startsWith("a"))
//                .forEach(System.out::println);
//
//        new ArrayList<String>(Arrays.asList("aaa","ddd")).stream().filter(x->x.startsWith("a"));

//        Predicate<String > nullCheck = arg -> arg!=null;
//        Predicate<String > emptyCheck = arg -> arg.length() > 0;
//        Predicate<String > nullAndEmptyCheck = nullCheck.and(emptyCheck);
//
//        String helloStr = "hello";
//        System.out.println(nullAndEmptyCheck.test(helloStr));
//        String nullStr = null;
//        System.out.println(nullAndEmptyCheck.test(nullStr));

//        Arrays.stream("4,-9,16".split(","))
//                .map(Integer::parseInt)
//                .map(i->(i<0)?-i:i)
//                .forEach(System.out::println);

        Random random = new Random();
        Stream.generate(random::nextInt)
                .limit(5)
                .forEach(System.out::println);
    }
}

