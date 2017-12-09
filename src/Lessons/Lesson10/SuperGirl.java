package Lessons.Lesson10;

import Lessons.Lesson9.Girl;

public class SuperGirl extends Lessons.Lesson10.Girl {

    public SuperGirl(String name, int age) {
        super(name, age); //Через супер обращаемся к выше стоящему класу родителю и берем его свойства я
    }
}
