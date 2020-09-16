package ch7_나머지주요구성요소.a15_Abstact_추상클래스.interface_.Relation;

public class Camera_Digital extends Camera implements Chargeable {
//Camera 상속받고 Chargeable 구현
    @Override
    public void charge() { //charge 재정의
        System.out.println("BlackBox 충전 중");
    }
}
