package week02;

public class W14 {
    public static void main(String[] args) {
//        int number = 0;
//        while (number < 3) {
//            number++;
//            System.out.println(number);
//        }

//        int number =4;
//        do {
//            System.out.println(number);
//        } while (number > 10);

        //break는  가장 가까운 블록의 for while switch문을 중단한다.
        int number = 0;
        while (number<3) {
            number++;
            if (number ==2) {
                break;
            }
            System.out.println(number + "출력!");
        }
    }
}
