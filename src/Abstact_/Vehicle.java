package Abstact_;

//public class Vehicle {
abstract class Vehicle {

    private int curX, curY;

    public void reportPosition(){
        System.out.printf("현재위치는 (%d %d) 입니다.\n", curX, curY);
    }

    /*public void addFuel(){
        System.out.println("모든 운송 수단은 연료가 필요");
    }*/
    public abstract void addFuel();


}
