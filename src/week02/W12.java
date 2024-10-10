package week02;

import java.util.Scanner;

public class W12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("오늘은 몇월인가요?");

        String monthString;
        int month = sc.nextInt();
        sc.nextLine();

        switch (month) {
            case 1:
                monthString = "1월";
                break;
            case 2:
                monthString = "2월";
                break;
            case 3:
                monthString = "3월";
                break;
            case 4:
                monthString = "4월";
                break;
            case 5:
                monthString = "5월";
                break;
            case 6:
                monthString = "6월";
                break;
            case 7:
                monthString = "7월";
                break;
            case 8:
                monthString = "8월";
                break;
            case 9:
            monthString = "9월";
                break;
            case 10:
                monthString = "10월";
                break;
            case 11:
                monthString = "11월";
                break;
            case 12:
                monthString = "12월";
                break;
            default:
                monthString = "알수없음.";
                break;
        }
        System.out.println(monthString);
    }
}
