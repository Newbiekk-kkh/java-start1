package week03.sample;

//지역변수
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.getNumber());
        System.out.println(main.getNumber());
    }

    // 메서드
    public int getNumber () {
        int number =1;
        number += 1;
        return number;
    }
}
