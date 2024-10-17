package week02.arr;

import java.util.ArrayList;

public class Arr02 {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<Integer>();

        intList.add(99);
        intList.add(15);
        intList.add(4);

        System.out.println(intList.get(1));

        intList.set(1,10);
        System.out.println(intList.get(1));

        intList.remove(0);
        System.out.println(intList.get(0));

        intList.clear();
        System.out.println(intList.toString());
    }
}
