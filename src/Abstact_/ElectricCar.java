package Abstact_;

public class ElectricCar {
    private int curX, curY;

    public void reportPosition(){
        System.out.printf("현재위치는 (%d %d) 입니다.\n", curX, curY);
    }

    public void addFuel(){
        System.out.println("급속 충전");
    }
}
