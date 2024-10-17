package week02.arr;

import java.util.Scanner;

public class If2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("가격을 입력해주세요.");
        int price = sc.nextInt();
        sc.nextLine();
        System.out.println("나이를 입력해주세요.");
        int age = sc.nextInt();
        sc.nextLine();
        int discount = 0;

        if (price >= 10000) {
            discount = discount + 1000;
            System.out.println("만원이상 구매, 천원 할인 대상입니다.");
        }
        if (age <= 10) {
            discount = discount + 1000;
            System.out.println("10살 이하 고객, 천원 할인 대상입니다.");
        }

        System.out.println("총 할인 금액은 " + discount +"원 입니다." );

    }
}
