package ch7_나머지주요구성요소.a15_Abstact_추상클래스.interface_.Relation;

public class Phone_Hand extends Phone implements Chargeable{
 //phone 상속받고 chargeable을 구현
    @Override
    public void charge() { //charge 재정의
        System.out.println("HandPhone 충전 중");
    }
}
