package Lessons.Lesson8;

public class Lesson8_1 {
    String name;
    int age;

    void goToCinema(){
        System.out.println("\n Go");
    }
    String goToRest(String rest){
        if("Mac".equals(rest))
            return "No";
        return "Yes";
    }
}
