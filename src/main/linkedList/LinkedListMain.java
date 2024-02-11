package main.linkedList;


import main.linkedList.core.lists.GBLinkedList;

import java.util.Iterator;

public class LinkedListMain {
    public static void main(String[] args) {
        GBLinkedList<Integer> gbLL = new GBLinkedList<>();
        gbLL.addFirst(123);
        gbLL.addLast(234);
        gbLL.addLast(345);
        gbLL.addLast(456);
        gbLL.addLast(999);
        gbLL.addFirst(100);

        for(Integer i: gbLL){
            System.out.println(i);
        }

//        Iterator<Integer> iterator = gbLL.descendingIterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
    }
}
