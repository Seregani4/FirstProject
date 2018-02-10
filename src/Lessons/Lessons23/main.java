package Lessons.Lessons23;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class main {
    public static void main(String[] args) {
        Predicate<Integer> a = s-> s%2 ==0;
        List<Date> collect = Stream.generate(Date::new).limit(5).collect(Collectors.toList());
        System.out.println(collect);
    }
}
