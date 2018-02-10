package Lessons.Lessons18;
import java.text.*;
import java.util.Locale;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class main2 {
    public static void main(String args[]) {
//        //беру строку разбираю ее и записываю только маленькие не повторяющиеся буквы
//        String collect = "qwertyuiopQWERTYUIOPqwertyuiop"
//                .chars()
//                .mapToObj(s-> (char)s+"")
//                .map(String::toLowerCase)
//                .distinct()
//                .collect(Collectors.joining(" "));
//        System.out.println(collect);

//        Pattern.compile(":")
//
//                .splitAsStream("foobar:foo:bar")
//                .filter(s->s.contains("bar"))
//                .sorted()
//                .collect(Collectors.joining(":"));
//
//        Pattern pattern =
//                Pattern.compile(".*@gmail\\.com");
//        Stream.of("sergey@gmail.com", "sergey@mail.ru", "sereganich92@gmail.com")
//                .filter(pattern.asPredicate())
//                .count();
//        System.out.println(pattern);


        //локаль для раззного языка

        NumberFormat nfGe = NumberFormat.getInstance(Locale.GERMAN);
        NumberFormat nfUs = NumberFormat.getInstance(Locale.US);
        NumberFormat nfFr = NumberFormat.getInstance(Locale.FRANCE);
        double iGe = 0, iUs = 0, iFr = 0;
        String str = "1.234,5";
        try{
            iGe = nfGe.parse(str).doubleValue();
            iUs = nfUs.parse(str).doubleValue();
            iFr = nfFr.parse(str).doubleValue();
        } catch (ParseException e) {
            System.out.println("Error" + e.getErrorOffset());
        }
        System.out.printf("iGe = %f\niUs = %f\niFr = %f", iGe, iUs, iFr);
        String sUs = nfUs.format(iGe);
        String sFr = nfFr.format(iGe);
        System.out.println("\nUs" + sUs + "\nFr" + sFr);
    }


}