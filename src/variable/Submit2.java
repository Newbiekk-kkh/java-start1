package variable;

import java.util.Scanner;

public class Submit2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // - 요리 제목 입력
        System.out.println("요리 제목을 입력해주세요.");
        String title = sc.nextLine();
        System.out.println("[" + title + "]");

        // - 요리 별점 입력
        System.out.println("요리 별점을 1-5 사이의 소수점이 있는 실수로 입력해주세요.");
        float rate = sc.nextFloat(); // Float 실수는 nextFloat() 메서드로 받습니다.

        int intRate = (int)rate;
        System.out.print("별점 : " + intRate);
        System.out.println(" (" + 20 * rate + "%)");

        // - 레시피 입력
        System.out.println("요리 레시피를 한문장씩 10문장을 각각 입력해주세요.");

        String input1 = sc.nextLine();
        String input2 = sc.nextLine();
        String input3 = sc.nextLine();
        String input4 = sc.nextLine();
        String input5 = sc.nextLine();
        String input6 = sc.nextLine();
        String input7 = sc.nextLine();
        String input8 = sc.nextLine();
        String input9 = sc.nextLine();
        String input10 = sc.nextLine();

        // - 입력 받은 정보 총 출력
        System.out.println("[" + title + "]");
        System.out.print("별점 : " + intRate);
        System.out.println("(" + 20 * rate + "%)");

        System.out.println("1. " + input1);
        System.out.println("2. " + input2);
        System.out.println("3. " + input3);
        System.out.println("4. " + input4);
        System.out.println("5. " + input5);
        System.out.println("6. " + input6);
        System.out.println("7. " + input7);
        System.out.println("8. " + input8);
        System.out.println("9. " + input9);
        System.out.println("10. " + input10);
    }
}