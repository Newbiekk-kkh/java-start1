package week02;

public class W08 {
    public static void main(String[] args) {
        int x = 2;
        int y = 9;
        int z = 10;

        boolean result = x < y && y < z;
        System.out.println(result);
        System.out.println("-------------");

        result = x + 10 < y && y < z;
        System.out.println(result);

        float g = 10f;
        System.out.println(g);

        System.out.println(8<<14);
    }
}
