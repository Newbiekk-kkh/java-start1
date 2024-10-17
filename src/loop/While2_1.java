package loop;

public class While1_2 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;

        while (i < 3) {
            i = ++i;
            sum = sum + i;
            System.out.println(sum);
        }
    }
}
