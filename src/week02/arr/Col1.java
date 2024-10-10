package week02.arr;

import java.util.Stack;

public class Col1 {
    public static void main(String[] args) {
        Stack<Integer> intStack = new Stack<>();

        intStack.push(10);
        intStack.push(15);
        intStack.push(100);
        intStack.push(1000);
        intStack.push(10000);

        System.out.println(intStack.toString());

        while (!intStack.empty()){
            System.out.println(intStack.pop());
        }

        intStack.push(10);
        intStack.push(15);
        intStack.push(100);
        intStack.push(1000);
        intStack.push(10000);

        System.out.println(intStack.peek());
        System.out.println(intStack.size());
    }
}
