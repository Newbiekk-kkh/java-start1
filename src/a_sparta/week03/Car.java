package week03;

public class Car {
    //필드영역
    //1.고유 데이터 영역
    String company;
    String model;
    String color;
    double price;
    //2.상세 데이터 영역
    double speed;
    char gear;
    boolean lights;
    //3. 객체 데이터 영역
    Tire tire;
    Door door;
    Handle handle;

    //생성자영역
    public Car (){
        System.out.println("생성자가 호출되었습니다! 객체가 생성됩니다.");
    }

    //메서드 영역
    double gasPedal (double kmh) {
        speed =kmh;
        return speed;
    }

    double brakePedal () {
        speed = 0;
        return speed;
    }

    char changeGear (char type) {
        gear = type;
        return gear;
    }

    boolean onOffLight () {
        lights = !lights;
        return lights;
    }

    void horn () {
        System.out.println("빵빵!");
    }
}
