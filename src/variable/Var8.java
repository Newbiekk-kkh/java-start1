package variable;

public class Var8 {
    public static void main(String[] agrs) {
        //정수
        byte b = 127; //-128 ~ 127 까지 저장가능
        short s = 32767; // -32,768 ~ 32,767 까지 저장가능
        int i = 2147483647; // -2,147,483,648 ~ 2,147,483,647 까지 저장가능

        long l = 9223372036854775807L; // -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807

        //실수
        float f = 10.0f;
        double d = 10.0; // double 이 더 넓은 범위 저장가능

        // 리터럴 타입은 정수는 int , 실수는 double이 기본형이라고 생각하면 좋다.
    }
}
