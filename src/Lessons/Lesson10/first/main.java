package Lessons.Lesson10.first;

import Lessons.Lesson10.second.C3;

public class main {
    public static void main(String[] args) { //из всех 3ех вариантав выдает последний выполненный так как с3 в другом пакете и не выполняеться
        C1 c = new C4();
        c.m();
    }
}
