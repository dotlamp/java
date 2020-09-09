package polymorphism;

import inheritance.Person;
import inheritance.Superman;

public class InstaceOfTest {

    public void badCasting(){
        Person person = new Person();
        Superman sman = (Superman)person;
        sman.fly();
    }

    public void goodCasting(){
        Person person = new Person();
        if(person instanceof Superman){
            Superman sman = (Superman)person;
            sman.fly();
        }else{
            System.out.println("Superman 에 적합하지 않은 객체");
        }
    }

    public static void main(String[] args) {
        InstaceOfTest iot = new InstaceOfTest();
        //iot.badCasting();
        //메서드 호출은 런타임 오류 발생
        iot.goodCasting();
    }
}