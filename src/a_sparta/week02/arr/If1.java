package week02.arr;

import java.util.Scanner;

public class If1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("나이를 입력해주세요.");
        int age = sc.nextInt();
        sc.nextLine();

        if (age>=20) {
            System.out.println("성인입니다.");
        } else if(age<=7) {
            System.out.println("미취학입니다.");
        } else if(age<=13) {
            System.out.println("초등학생입니다.");
        } else if(age<=16) {
            System.out.println("중학생입니다.");
        } else if(age<=19) {
            System.out.println("고등학생입니다.");
        }


    }
}
