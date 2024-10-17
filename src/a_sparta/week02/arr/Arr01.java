package week02.arr;

import java.util.Arrays;

public class Arr01 {
    public static void main(String[] args) {
        int [] a = { 1, 2, 3,4 };
        int [] b = Arrays.copyOf(a, a.length);

        a[3] = 10;
        System.out.println(a[0]);
        System.out.println(b[3]);
    }
}
