package Lessons.Lessons14;

import Lessons.Lesson13.IA;

public class A {
//    String a = "Base class";
//    public void show() {
//        System.out.println(a);
//    }
//
//    static  class B {
//        String b = "Static class";
//
//        public void show() {
//            System.out.println(b);
//        }
//    }
//    class C{
//        String c="Non Static";
//        public void show() {
//            System.out.println(c);
//        }

    UA a;
    IB b;
    IC c;

    public A(UA a, IB b, IC c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    void print(){
        a.print();
        b.print();
        c.print();

    }
    }

