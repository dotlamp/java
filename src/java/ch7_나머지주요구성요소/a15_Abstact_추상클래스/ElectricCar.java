package java.ch7_나머지주요구성요소.a15_Abstact_추상클래스;

public class ElectricCar {
    private int curX, curY;

    public void reportPosition(){
        System.out.printf("현재위치는 (%d %d) 입니다.\n", curX, curY);
    }

    public void addFuel(){
        System.out.println("급속 충전");
    }
}
