package week02.arr;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("점수를 입력해주세요.");
        int score = sc.nextInt();
        sc.nextLine();

        boolean result = 80 <= score && score <= 100;
        System.out.println(result);

    }
}
