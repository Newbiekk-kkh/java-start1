package week02;

public class W10 {
    public static void main(String[] args) {
        boolean flag = false;
        int number = 2;

        if (flag) {
            System.out.println("flag가 true입니다.");
            if (number == 1) {
                System.out.println("number값이 1입니다.");
            } else {
                System.out.println("number값이 2입니다.");
            }
        } else {
            System.out.println("flag가 false입니다.");
        }
    }
}
