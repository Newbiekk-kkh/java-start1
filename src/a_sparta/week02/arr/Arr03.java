package week02.arr;

import java.util.LinkedList;

public class Arr03 {
    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        linkedList.add(1);
        linkedList.add(4);
        linkedList.add(7);
        linkedList.add(10);

        System.out.println(linkedList.get(1));

        linkedList.add(3, 100);
        System.out.println(linkedList.toString());

        linkedList.set(2, 100000);
        System.out.println(linkedList.toString());

    }
}
