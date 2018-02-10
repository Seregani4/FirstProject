package Lessons.Lessons21;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        //set берет только разные значения
        //list работа со списком
        //queue работа с очередью можно брать начало и конец если это deque



//        HashSet<String> hs = new HashSet<String>();
//
//        hs.add("B");
//        hs.add("A");
//        hs.add("D");
//        hs.add("E");
//        hs.add("P");
//        hs.add("C");
//        hs.add("F");
//
//        System.out.println(hs);
        //это пустой масив
//        ArrayList<String> list = new ArrayList<String>();

        PriorityQueue<String> queue1 = new PriorityQueue<>();
        queue1.offer("Zero");
        queue1.offer("Zaro");
        queue1.offer("Oklahoma");
        queue1.offer("Indiana");
        queue1.offer("Georgia");
        queue1.offer("Texas");
        System.out.println("Priority");
        while (queue1.size()> 0) {
            System.out.println(queue1.remove()+ "");
        }
    }
}
