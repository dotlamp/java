package java.ch7_나머지주요구성요소.a15_Abstact_추상클래스.interface_.Relation;

public class RelationTest {

    void badCase(){
        Object[] objs = {new Phone_Hand(), new Camera_Digital()};
        //Object를 이용한 관계만을 사용함으로 charge 메서드 수행 위해 별도의 형변환 처리하는 등 절차 필요
        for(Object obj : objs){
            if(obj instanceof Phone_Hand){
                Phone_Hand phone = (Phone_Hand)obj;
                phone.charge();
            }else if(obj instanceof Camera_Digital){
                Camera_Digital camera = (Camera_Digital)obj;
                camera.charge();
            }
        }
    }

    void goodCase(){
        Chargeable[] objs = {new Phone_Hand(), new Camera_Digital()};
        for(Chargeable obj : objs){
            obj.charge();
        }
    }
    //Chargeable을 이용한 관계를 이용해 별도의 형변환 절차 없이 chargeable이 가진 charge 메서드를 호출할 수 있다

    public static void main(String[] args) {
        RelationTest lct = new RelationTest();
        lct.badCase();
        lct.goodCase();
    }
}
