package week02;

import java.util.Scanner;

public class W15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력해주세요");
        int inputNumber = sc.nextInt();

        for (int i=2 ; i<=9 ; i++) {
            if (inputNumber == i) {
                for (int j=2; j<=9 ; j++){
                    System.out.println(i + "곱하기" + j + "는" + (i*j) + "입니다.");
                }
            }
        }
    }
}
