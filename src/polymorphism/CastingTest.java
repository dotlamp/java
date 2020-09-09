package polymorphism;

import inheritance.Person;
import inheritance.Superman;

public class CastingTest {
    public void primitive(){
        byte b = 10;
        int i = b; //묵시적 형변환 : 작은 -> 큰

        byte b2 = (byte)i; //명시적 형변환 : 큰 -> 작은

    }

    public void reference(){
        Person p = new Superman(); //묵시적 형변환 : 작은 -> 큰
        //p.fly(); //메모리에 있지만 사용불가
        Superman sman =(Superman)p;
        sman.fly();
    }

    public void useJump1(Object obj){
        if(obj instanceof Person){
            Person casted = (Person)obj;
            casted.jump();
        }else{
            System.out.println("Superman 에 적합하지 않은 객체");
        }
    };


    public void useJump2(Person person){
        person.jump();
    };

    public void useJump3(Superman superman){
        superman.jump();
    };

    public static void main(String[] args) {
        CastingTest cs = new CastingTest();

        cs.useJump1(new Object());
        cs.useJump1(new Person());
        cs.useJump1(new Superman());


        System.out.println("___");
        //cs.useJump2(new Object());
        cs.useJump2(new Person());
        cs.useJump2(new Superman());

        System.out.println("___");
        //cs.useJump3(new Object());
        //cs.useJump3(new Person());
        cs.useJump3(new Superman());
    }

    /*
    * 다형성을 이용해 메서드의 파라미터를 구성할 떄는 가급적 상위 타입을 잡는 것이 좋다.
    * 하지만 최상위의 Object까지 올라가버리면 별도의 형변환 절차가 필요해져서 번거로움이 커진다.
    * Object를 파라미터로 받는 메서드들은 대부분 자바 API처럼 광범위하게 사용되는 경우이다.
    * */

}